package com.kodframe.easyoracle.db;

import org.apache.ibatis.jdbc.SQL;

public class SqlBuilder {

	// If not use @Param, you should be define same arguments with mapper method
	public static String buildSelectTableSql() {
		SQL sqlStr = new SQL();
		sqlStr.SELECT("*");
		sqlStr.FROM("WYC_CUSTOMER");
		
		return sqlStr.toString();
	}

}
