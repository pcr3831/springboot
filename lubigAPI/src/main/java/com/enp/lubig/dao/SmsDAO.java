package com.enp.lubig.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("_smsDAO")
public interface SmsDAO {
	
	public int sendSms(Map<String,Object> param) throws Exception;

}
