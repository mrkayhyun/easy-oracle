package com.kodframe.easyoracle.db.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.kodframe.easyoracle.db.SqlBuilder;

public interface SqlDao {

/*	@SelectProvider(type = SqlBuilder.class, method = "buildSelectTableSql") */
/*	@Results({ @Result(property = "userName", column = "user_name"),
	@Result(property = "userAddress", column = "user_address") })*/
/*	public List<HashMap<String, String>> selectTable();*/
}
