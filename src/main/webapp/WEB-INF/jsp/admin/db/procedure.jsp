<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/inc/head.jsp"%>
<div class="container-fluid" ng-controller="dbProcedureListController">

<div class="row">
	<div class="col-md-2">
 		<select ng-model="searchOwner" ng-change="selectAllProceduresList('PACKAGE',searchOwner)" class="form-control">
			<option value="">전체</option>
			<option ng-repeat="ol in ownerList" value="{{ol.OWNER}}" >{{ol.OWNER}}</option>
		</select>
<!-- 		<input type="button" value="search" ng-click="selectAllProceduresList('PACKAGE','')"/> -->
	</div>
	<div class="col-md-2">
		<input ng-model="searchText" class="form-control">
	</div>
	<div class="col-md-6"></div>
</div>


<div class="row">
	<div class="col-md-6">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>OWNER</th>
					<th>OBJECT_NAME</th>
					<th>PROCEDURE_NAME</th>
					<th>OBJECT_TYPE</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="pl in procedureList | filter:searchText">
					<td>{{pl.owner}}</td>
					<td><a href="#" ng-click="selectAllSourceList(pl.owner, 'PACKAGE', pl.objectName)">{{pl.objectName}}</a></td>
					<td><a href="#" ng-click="selectArgumentList(pl.objectName, pl.procedureName)">{{pl.procedureName}}</a></td>
					<td>{{pl.objectType}}</td>
				</tr>
			</tbody>
		</table>	
	</div>
	<div class="col-md-6">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>PACKAGE_NAME</th>
					<th>OBJECT_NAME</th>
					<th>ARGUMENT_NAME</th>
					<th>IN_OUT</th>
					<th>DATA_TYPE</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="al in argumentList">
					<td>{{al.packageName}}</td>
					<td>{{al.objectName}}</td>
					<td>{{al.argumentName}}</td>
					<td>{{al.inOut}}</td>
					<td>{{al.dataType}}</td>
				</tr>
			</tbody>
		</table>	
		<textarea ui-codemirror ui-codemirror-opts="editorOptions" ng-model="allSource" class="form-control" rows="20"></textarea>
	</div>
</div>  
</div>
</body>
</html>