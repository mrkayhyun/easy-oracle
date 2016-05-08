package com.kodframe.easyoracle.db.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sqlDao")
public class SqlDaoImpl implements SqlDao{

	@Autowired
	private SqlSession sqlSession;
	
/*	@Override
	public List<HashMap<String, String>> selectTable() {
		
	}*/

}
