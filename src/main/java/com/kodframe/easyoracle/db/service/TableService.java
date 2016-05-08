package com.kodframe.easyoracle.db.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodframe.easyoracle.db.dao.TableDao;

@Service("TableService")
public class TableService {

	@Autowired
	private TableDao tableDao;

	public List<TableVo> selectAllTablesList(TableVo param) throws Exception {
		return tableDao.selectAllTablesList(param);
	}
	
	public List<HashMap<String, String>> selectTableDesc(TableVo param) {
		return tableDao.selectTableDesc(param);
	}

	public List<HashMap<String, String>> selectAllOwner() {
		return tableDao.selectAllOwner();
	}

}
