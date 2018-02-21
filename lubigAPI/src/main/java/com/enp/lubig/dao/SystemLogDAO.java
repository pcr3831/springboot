package com.enp.lubig.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.enp.lubig.vo.SystemLogVO;

@Repository("_systemLogDAO")
public interface SystemLogDAO {
	public int insertSystemLog() throws Exception;
	
	public List<SystemLogVO> selectSystemLog(SystemLogVO systemLogVO) throws Exception;
	
	/*
	
	public int updateSystemLog() throws Exception;
	
	public int deleteSystemLog() throws Exception;
	*/
}
