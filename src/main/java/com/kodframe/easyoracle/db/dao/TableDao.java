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
	
	public List<TableVo> selectAllTablesList(TableVo param) {
		return sqlSession.selectList("tableDao.selectAllTablesList", param);
	}
	
	public List<HashMap<String, String>>  selectTableDesc(TableVo param) {
		return sqlSession.selectList("tableDao.selectTableDesc", param);
	}

	public List<HashMap<String, String>>  selectAllOwner() {
		return sqlSession.selectList("tableDao.selectAllOwner");
	}

	public List<HashMap<String, String>> selectTableDataList(HashMap<String, String> param) {
		return sqlSession.selectList("tableDao.selectTableDataList", param);
	}
}
