<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/inc/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="kApp">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>easy oracle</title>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
    <script src="/resources/js/clipboard.js"></script>	
    <script src="/resources/js/ngclipboard.min.js"></script>	
	<!-- cdn에 있는 부트스트랩 사용 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
	<link rel="stylesheet" href="/resources/css/codemirror.css">
    <script src="/resources/js/codemirror.js"></script>
	<script src="/resources/js/sql-hint.js"></script>
	<script src="/resources/js/ui-codemirror.js"></script>
    <script src="/resources/js/common.js"></script>
    <script src="/resources/js/app.js"></script>

    <style type="text/css">
    body {
  		padding-top: 80px;
	}
	.row {
		padding-top: 10px;
	}
	th{
		text-align: center;
	}
    </style>
</head>

<body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<%=request.getContextPath()%>/admin/db/table.do">easy oracle</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li <% if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("table.jsp")) { %>class="active"<% } %>><a href="<%=request.getContextPath()%>/admin/db/table.do">Table</a></li>
            <li <% if(request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1).equals("procedure.jsp")) { %>class="active"<% } %>><a href="<%=request.getContextPath()%>/admin/db/procedure.do">Procedure</a></li>
          </ul>
        </div>
      </div>
    </nav>