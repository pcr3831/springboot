package com.enp.lubig.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.enp.lubig.dao.SystemLogDAO;
import com.enp.lubig.service.SystemLogService;
import com.enp.lubig.vo.SystemLogVO;

@Service("_systemLogService")
public class SystemLogServiceImpl implements SystemLogService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Resource(name = "_systemLogDAO")
	private SystemLogDAO systemLogDao;

	@Override
	public int insertSystemLog(SystemLogVO syslogVo) throws Exception {

		int insertCnt = 0;
		insertCnt = systemLogDao.insertSystemLog();
		log.info(this.getClass().getMethods() + " insertCnt = " + insertCnt);
		return insertCnt;
	}

	@Override
	public List<SystemLogVO> selectSystemLog(SystemLogVO syslogVo) throws Exception {
		List<SystemLogVO> result = systemLogDao.selectSystemLog(syslogVo);
		return result;
	}

}
