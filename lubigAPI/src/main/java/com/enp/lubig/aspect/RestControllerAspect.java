package com.enp.lubig.aspect;

import java.net.InetAddress;
import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.enp.lubig.service.SystemLogService;
import com.enp.lubig.vo.SystemLogVO;

@Aspect
public class RestControllerAspect {
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="systemLogService")
	private SystemLogService systemLogService;
	
//	@Around("execution(public * " + ContextConstant.BASE_PACKAGE +".rest.*Controller.*(..))")
//	public void logAroundRestCall(JoinPoint jp) throws Throwable {
//		log.info("=== AOP Around REST call ===\n" + jp);
//	}
	
//	@Before("execution( * com.lubig.service.advertisement..*.*(..))")
	public void logBeforeRestCall(JoinPoint jp) throws Throwable {
		log.info("=== AOP Before REST call ===\n" + jp.getSignature().getName());
		log.info(jp.toString());
	}	
	
	@Pointcut("within(@org.springframework.stereotype.Controller *)")
	public void controller() {
	}

	@Pointcut("execution(* *.*(..))")
	protected void allMethod() {
	}

	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestBody)")
	public void requestBody() {
		
	}
	
//	@Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	
//	@Around("controller()")
	public Object logAroundRestCall(ProceedingJoinPoint pjp ) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes())
                .getRequest();
        SystemLogVO syslogVo = new SystemLogVO();
        StringBuilder sb = new StringBuilder();
		log.info("=== Before REST call Start === ");
		log.debug( pjp.getTarget() + " " + pjp.getSignature().getName());
		Object[] args = pjp.getArgs();
		if (null != request) {
			log.info("--- Header Start ---");
			log.info("Method Type : " + request.getMethod());
			sb.append("Method Type : " + request.getMethod()+"\n");
			Enumeration<String> headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String headerName = (String) headerNames.nextElement();
				log.debug(headerName + " : " + request.getHeader(headerName));
				if("userKey".equals(headerName)) {
					syslogVo.setUserKey(request.getHeader(headerName));
				}
			}
			log.info("--- Header End ---");
			log.info("** Request Path info : " + request.getServletPath());
			// request parameter 로깅
			sb.append(request.getServletPath()+"\n");
			log.info("--- Request Parameters Start ---");
			if (args.length > 1) {
				if (args[1] != null || args[1].equals(null)) {
					log.info(args[1].toString());
					sb.append(args[1].toString());
					syslogVo.setRequestParameter(sb.toString());
				}
			}
			log.info("--- Request Parameters End ---");
			//초기화
			sb.setLength(0);

			// request body 로깅
			log.info("--- Request Body Start ---");
			if (args.length > 2) {
				if (request.getContentType() != null && args[2] != null) {
					log.info(args[2].toString());
					sb.append(args[2].toString());
					syslogVo.setRequestBody(sb.toString());
				}
			}
			log.info("--- Request Body End ---");

			//초기화
			sb.setLength(0);

		}
		log.info("=== Before REST call End ===");

		Object result = pjp.proceed();
		
		log.info("=== return REST call Start ===");
		String returnValue = this.getValue(result);
		// return 값 로깅
		log.info("Return value : " + returnValue);
		sb.append(returnValue);
		syslogVo.setResponseParameter(sb.toString());
		log.info("=== return REST call End ===\n");
		
		syslogVo.setHost(InetAddress.getLocalHost().getHostAddress());
		syslogVo.setIpaddr(request.getRemoteAddr());
		systemLogService.insertSystemLog(syslogVo);
		
		return result;
		
	}

/*
	@AfterReturning(pointcut = "controller()", returning = "result")
	public void logAfter(JoinPoint joinPoint, Object result) {
		log.info("=== return REST call Start ===");
		String returnValue = this.getValue(result);
		log.info("Return value : " + returnValue);
		log.info("=== return REST call End ===\n");

	}
*/
	private String getValue(Object result) {
		String returnValue = null;
		if (null != result) {
			if (result.toString().endsWith("@" + Integer.toHexString(result.hashCode()))) {
				returnValue = ReflectionToStringBuilder.toString(result);
			} else {
				returnValue = result.toString();
			}
		}
		return returnValue;
	}
}
