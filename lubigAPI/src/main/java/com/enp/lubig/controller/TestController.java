package com.enp.lubig.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enp.lubig.service.SystemLogService;
import com.enp.lubig.vo.SystemLogVO;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@Resource(name="_systemLogService")
	SystemLogService systemLogService;
	
	@RequestMapping(value="/hi")
	public String hi() {
		return "HI";
	}
	
	@RequestMapping(value="/dbTest")
	public ResponseEntity<Map<String,Object>> dbTest() throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", "0000");
		
		SystemLogVO syslogVo = new SystemLogVO();
		result.put("data", systemLogService.selectSystemLog(syslogVo));
		
		return new ResponseEntity<Map<String,Object>>(result,HttpStatus.OK);
	}

}
