package com.kodframe.easyoracle.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodframe.easyoracle.board.dao.BoardDao;

@Service("boardService")
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	public List<BoardVo> selectBoardList() throws Exception {
			return boardDao.selectBoardList();
	}
	
}
