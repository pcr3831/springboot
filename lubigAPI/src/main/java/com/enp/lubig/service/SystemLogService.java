package com.enp.lubig.service;

import java.util.List;

import com.enp.lubig.vo.SystemLogVO;

public interface SystemLogService {
	
	public int insertSystemLog(SystemLogVO syslogVo) throws Exception;
	
	public List<SystemLogVO> selectSystemLog(SystemLogVO syslogVo) throws Exception;
	
}
