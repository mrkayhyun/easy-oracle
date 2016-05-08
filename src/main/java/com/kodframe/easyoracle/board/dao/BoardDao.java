package com.kodframe.easyoracle.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kodframe.easyoracle.board.service.BoardVo;

@Repository("boardDao")
public class BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> selectBoardList() {
		return sqlSession.selectList("boardDao.selectBoardList");
	}
}
