package com.kodframe.easyoracle.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodframe.easyoracle.db.service.ArgumentVo;
import com.kodframe.easyoracle.db.service.ProcedureVo;
import com.kodframe.easyoracle.db.service.SourceVo;

@Repository("procedureDao")
public class ProcedureDao {

	@Autowired
	private SqlSession sqlSession;


	public List<ProcedureVo> selectAllProceduresList(ProcedureVo param) {
		return sqlSession.selectList("procedureDao.selectAllProceduresList", param);
	}
	
	public List<SourceVo> selectAllSourceList(SourceVo param) {
		return sqlSession.selectList("procedureDao.selectAllSourceList", param);
	}

	public List<ArgumentVo> selectArgumentList(ArgumentVo param) {
		return sqlSession.selectList("procedureDao.selectArgumentList", param);
	}
	
}
