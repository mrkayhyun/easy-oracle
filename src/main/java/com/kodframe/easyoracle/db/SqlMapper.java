package com.kodframe.easyoracle.db;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;

public interface SqlMapper {

	@SelectProvider(type = SqlBuilder.class, method = "buildSelectTableSql")
	List<HashMap<String, String>> selectTableData();


}
