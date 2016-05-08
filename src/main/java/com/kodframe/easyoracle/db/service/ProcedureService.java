package com.kodframe.easyoracle.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodframe.easyoracle.db.dao.ProcedureDao;

@Service("procedureService")
public class ProcedureService {

	@Autowired
	private ProcedureDao procedureDao;

	public List<ProcedureVo> selectAllProceduresList(ProcedureVo param) throws Exception {
		return procedureDao.selectAllProceduresList(param);
	}

	public List<SourceVo> selectAllSourceList(SourceVo param) throws Exception {
		return procedureDao.selectAllSourceList(param);
	}

	public List<ArgumentVo> selectArgumentList(ArgumentVo param) throws Exception {
		return procedureDao.selectArgumentList(param);
	}
}
