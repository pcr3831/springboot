package com.enp.lubig.advice;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * API ERROR 모델
 * 
 * @author crPark
 *
 */
public class ApiError {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timeStamp;
	// 에러코드
	private String errorCode;
	// 에러메세지
	private String errorMessage;
	// 디버그메세지
	private String debugMessage;

	/**
	 * @param errorCode
	 * @param errorMessage
	 * @param ex
	 */
	public ApiError(String errorCode, String errorMessage, Throwable ex) {
		this.timeStamp = LocalDateTime.now();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.debugMessage = ex.getLocalizedMessage();
	}
}
