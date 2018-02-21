package com.enp.lubig.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("_openFireDAO")
public interface OpenFireDAO {
	public int insertUser(Map<String,Object> param) throws Exception;
	
	public Map<String,Object> selectOfUserUserkey(Map<String,Object> param) throws Exception;
	
	public int insertOpenFireVCard(Map<String,Object> param) throws Exception;
	
	public Map<String,Object> selectProperty(Map<String,Object> param) throws Exception;
	
}
