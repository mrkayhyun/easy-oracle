<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/inc/head.jsp"%>
<div class="container-fluid" ng-controller="dbTableListController">

<!-- <div class="row">
	<div class="checkbox">
		<label ng-repeat="ol in ownerList">
			<input type="checkbox" name="" value="" >
			{{ol.OWNER}}
		</label>
	</div>		
</div> -->
<div class="row">
	<div class="col-md-2">
<!-- 		<select ng-model="searchOwner" ng-change="selectAllTablesList(searchOwner)" class="form-control">
			<option value="">전체</option>
			<option ng-repeat="ol in ownerList" value="{{ol.OWNER}}" >{{ol.OWNER}}</option>
		</select> -->
		<input ng-model="searchText" uppercase-only ng-keyup="$event.keyCode == 13 && selectAllTablesList('',searchText)" class="form-control" />
	</div>
	<div class="col-md-2">

		<input type="button" value="search" ng-click="selectAllTablesList('',searchText)" class="btn btn-primary">
	</div>
	<div class="col-md-6"></div>
</div>


<div class="row">
	<div class="col-md-6">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>OWNER</th>
					<th>TABLE_NAME</th>
					<th>TABLESPACE_NAME</th>
				</tr>
			</thead>
			<tbody>
<!-- 				<tr ng-repeat="tl in tableList | filter:searchText"> -->
				<tr ng-repeat="tl in tableList">
					<td>{{tl.owner}}</td>
					<td>
						<a href="#" ng-click="selectTableDesc(tl.owner, tl.tableName)">{{tl.tableName}}</a>
						<button class="btn" ngclipboard data-clipboard-text="SELECT * FROM {{tl.tableName}} ;">S</button>
					</td>
					<td>{{tl.tableSpaceName}}</td>
				</tr>
			</tbody>
		</table>	
	</div>
	<div class="col-md-6">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>COLUMN_NAME</th>
					<th>DATA_TYPE</th>
					<th>NULLABLE</th>
					<th>DATA_DEFAULT</th>
					<th>COLUMN_ID</th>
					<th>COMMENTS</th>
					<!-- <th>조회</th> -->
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="td in tableDesc">
					<td>{{td.COLUMN_NAME}}</td>
					<td>{{td.DATA_TYPE}}</td>
					<td>{{td.NULLABLE}}</td>
					<td>{{td.DATA_DEFAULT}}</td>
					<td>{{td.COLUMN_ID}}</td>
					<td>{{td.COMMENTS}}</td>
					<!-- <td> <input class="form-control" ng-model="col{{$index}}" value="" /></td> -->
				</tr>
			</tbody>
		</table>	
	</div>
</div>  
</div>
</body>
</html>