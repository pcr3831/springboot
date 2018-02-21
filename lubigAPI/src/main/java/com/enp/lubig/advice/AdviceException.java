package com.enp.lubig.advice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.enp.lubig.advice.exception.UserNotFoundException;
import com.enp.lubig.constant.Constants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestControllerAdvice
public class AdviceException {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private void log(HttpServletRequest request, HttpServletResponse response, Throwable ex) {
		Throwable tex = ex.getCause();
		StackTraceElement[] stacks = tex.getStackTrace();

		StringBuffer logInfo = new StringBuffer();
		logInfo.append(ex.getClass().getName());
		logInfo.append("|").append(request.getRequestURI());//API CODE(URL)
		logInfo.append("|").append(request.getRemoteAddr());	// 접속IP
		logInfo.append("|").append(null==ex.getMessage()?"":ex.getMessage().replace("\n","").replace("\r", ""));	// 처리 담당자 ID
		//java 8 lambda expressions
		//logInfo.append("|").append(Stream.of(stacks).map(at->at.toString()).collect(Collectors.joining("<<")));
		logInfo.append("|").append(String.join("<<", Arrays.copyOf(stacks, stacks.length, String[].class)));
		
		log.error(logInfo.toString().replace("\n", "").replace("\r",""));
	}
	
	
	@ExceptionHandler({SQLException.class})
	public ResponseEntity<Object> getSqlErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0003, Constants.ERROR_MSG_0003, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({NullPointerException.class})
	public ResponseEntity<Object> getNullErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0005, Constants.ERROR_MSG_0005, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({IOException.class})
	public ResponseEntity<Object> getIOErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0006, Constants.ERROR_MSG_0006, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({FileUploadException.class})
	public ResponseEntity<Object> getFileUploadErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0004, Constants.ERROR_MSG_0004, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({RuntimeException.class})
	public ResponseEntity<Object> getRunTimeErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0002, Constants.ERROR_MSG_0002, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({ParseException.class, JsonParseException.class})
	public ResponseEntity<Object> getParseErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0007, Constants.ERROR_MSG_0007, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	@ExceptionHandler({MappingException.class, JsonMappingException.class})
//	public ResponseEntity<Object> getMappingErrorMessage(Exception e) {
//		ApiError apiError = new ApiError(Constants.ERROR_CODE_0008, Constants.ERROR_MSG_0008, e);
//		e.printStackTrace();
//
//		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	@ExceptionHandler({UserNotFoundException.class})
	public ResponseEntity<Object> getUserNotFoundErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0009, Constants.ERROR_MSG_0009, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({HttpMessageNotReadableException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> getHttpMessageNotReadableError(Exception e){
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0401, Constants.ERROR_MSG_0401, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({Exception.class})
	public ResponseEntity<Object> getErrorMessage(Exception e) {
		ApiError apiError = new ApiError(Constants.ERROR_CODE_0001, Constants.ERROR_MSG_0001, e);
		e.printStackTrace();

		return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}