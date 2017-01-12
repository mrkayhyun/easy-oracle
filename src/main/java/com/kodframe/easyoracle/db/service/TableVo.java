package com.kodframe.easyoracle.db.service;

public class TableVo {
	//ALL_TABLES 자바빈
	private String owner;
	private String tableName;
	private String tableSpaceName;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableSpaceName() {
		return tableSpaceName;
	}
	public void setTableSpaceName(String tableSpaceName) {
		this.tableSpaceName = tableSpaceName;
	}

}
