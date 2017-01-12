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

	/**
	 * 프로시저 리스트 조회
	 * @param param
	 * @return
	 */
	public List<ProcedureVo> selectAllProceduresList(ProcedureVo param) {
		return sqlSession.selectList("procedureDao.selectAllProceduresList", param);
	}

	/**
	 * 프로시저 내용 조회
	 * @param param
	 * @return
	 */
	public List<SourceVo> selectAllSourceList(SourceVo param) {
		return sqlSession.selectList("procedureDao.selectAllSourceList", param);
	}

	/**
	 * 프로시저 파라미터 조회
	 * @param param
	 * @return
	 */
	public List<ArgumentVo> selectArgumentList(ArgumentVo param) {
		return sqlSession.selectList("procedureDao.selectArgumentList", param);
	}
	
}
