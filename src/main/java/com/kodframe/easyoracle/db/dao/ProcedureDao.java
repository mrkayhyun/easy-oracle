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
	 * ���ν��� ����Ʈ ��ȸ
	 * @param param
	 * @return
	 */
	public List<ProcedureVo> selectAllProceduresList(ProcedureVo param) {
		return sqlSession.selectList("procedureDao.selectAllProceduresList", param);
	}

	/**
	 * ���ν��� ���� ��ȸ
	 * @param param
	 * @return
	 */
	public List<SourceVo> selectAllSourceList(SourceVo param) {
		return sqlSession.selectList("procedureDao.selectAllSourceList", param);
	}

	/**
	 * ���ν��� �Ķ���� ��ȸ
	 * @param param
	 * @return
	 */
	public List<ArgumentVo> selectArgumentList(ArgumentVo param) {
		return sqlSession.selectList("procedureDao.selectArgumentList", param);
	}
	
}
