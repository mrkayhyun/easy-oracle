package com.kodframe.easyoracle.db.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodframe.easyoracle.db.service.TableVo;

@Repository("tableDao")
public class TableDao {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * 테이블 목록 조회
	 * @param param
	 * @return
	 */
	public List<TableVo> selectAllTablesList(TableVo param) {
		return sqlSession.selectList("tableDao.selectAllTablesList", param);
	}

	/**
	 * 테이블 상세 조회
	 * @param param
	 * @return
	 */
	public List<HashMap<String, String>>  selectTableDesc(TableVo param) {
		return sqlSession.selectList("tableDao.selectTableDesc", param);
	}

	/**
	 * 오너 목록 조회
	 * @return
	 */
	public List<HashMap<String, String>>  selectAllOwner() {
		return sqlSession.selectList("tableDao.selectAllOwner");
	}

	/**
	 * 테이블 데이터 조회
	 * @param param
	 * @return
	 */
	public List<HashMap<String, String>> selectTableDataList(HashMap<String, String> param) {
		return sqlSession.selectList("tableDao.selectTableDataList", param);
	}
}
