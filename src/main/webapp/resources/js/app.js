var app = angular.module('kApp', ['ngclipboard','ui.codemirror'])
  .controller('dbTableListController', function($scope, $http) {
      var baseUrl = "http://localhost:8090";

	  $scope.selectAllTablesList = function(__owner, __tableName) {
	    var url = baseUrl+"/admin/db/selectAllTablesList.do?tableName="+__tableName;
	    if(__owner != "") {
	    	url = url+"?owner="+__owner;
	    }
	
	    $http.get(url).
	        success(function(data, status, header, config) {
	            showConsole("== url success!!");
	            showConsole(data['list']);
	            $scope.tableList = data['list'];
	        }).
	        error(function(data, status, header, config) {
	        	alertError(url);
	        });
	  }
	  
	  $scope.selectTableDesc = function(__owner, __tableName) {
		    var url = baseUrl+"/admin/db/selectTableDesc.do?owner="+__owner+"&tableName="+__tableName;
			
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== url success!!");
		            showConsole(data['list']);
		            $scope.tableDesc = data['list'];
		            $scope.searchTableName = __tableName;
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });	  			  
	  }

	  $scope.selectTableDataList = function(__owner, __tableName) {
		  	var tn = __owner + "." +  __tableName;
		    var url = baseUrl+"/admin/db/selectTableDataList.do?tableName="+tn;
		    $http.get(url).
	        success(function(data, status, header, config) {
	            showConsole("== ++url success!!");
	            showConsole(data['list']);
	            $scope.tableDataList = data['list'];
	            var colName = [];
	            var colIndex = 0;

	            for(key in  data['list'][0]) {
	            	showConsole(key);
	            	colName[colIndex] = key;
	            	colIndex++;
	            }
	            showConsole(colName.length);
	            $scope.tableDataCol = colName;	        
	        }).
	        error(function(data, status, header, config) {
	        	alertError(url);
	        });	  			  
	  }
	  
	  $scope.selectAllOwner = function() {
		    var url = baseUrl+"/admin/db/selectAllOwner.do";
			
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== url success!!");
		            showConsole(data['list']);
		            $scope.ownerList = data['list'];
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });	  			  
	  }	 

	  $scope.selectAllOwner();
  })
  .controller('dbProcedureListController', function($scope, $http) {
      var baseUrl = "http://localhost:8090";

	  $scope.selectAllProceduresList = function(__objectType, __owner) {
		    var url = baseUrl+"/admin/db/selectAllProceduresList.do?objectType="+__objectType;
		    if(__owner != "") {
		    	url = url+"&owner="+__owner;
		    }
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== url success!!");
		            showConsole(data['list']);
		            $scope.procedureList = data['list'];
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });	  			  		  
	  }

	  $scope.selectAllSourceList = function(__owner, __type, __name) {
		    var url = baseUrl+"/admin/db/selectAllSourceList.do?owner="+__owner+"&type="+__type+"&name="+__name;
		
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== selectAllSourceList url success!!");
		            showConsole(data['list']);
		            var text = "";
		            for(var i=0; i<data['list'].length; i++) {
		            	text = text + data['list'][i].text;		            	
		            }
		            $scope.allSource = text;
		    	  
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });
	  }

	  $scope.selectArgumentList = function(__packageName, __objectName) {
		    var url = baseUrl+"/admin/db/selectArgumentList.do?packageName="+__packageName+"&objectName="+__objectName;
		
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== selectAllSourceList url success!!");
		            showConsole(data['list']);

		            $scope.argumentList = data['list'];
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });
	  }
	  
	  //전역 함수로 선언 할 수 있는 방법 찾아 보기
	  $scope.selectAllOwner = function() {
		    var url = baseUrl+"/admin/db/selectAllOwner.do";
			
		    $http.get(url).
		        success(function(data, status, header, config) {
		            showConsole("== url success!!");
		            showConsole(data['list']);
		            $scope.ownerList = data['list'];
		        }).
		        error(function(data, status, header, config) {
		        	alertError(url);
		        });	  			  
	  }	 	


		$scope.editorOptions = {
			lineWrapping : true,
			lineNumbers: true,
			readOnly: 'nocursor',
			mode: 'text/x-plsql',
		};	  
		$scope.selectAllOwner();

	  
	  
  });

app.directive('uppercaseOnly', [
	function() {
	  return {
	    restrict: 'A',
	    require: 'ngModel',
	    link: function(scope, element, attrs, ctrl) {
	      element.on('keypress', function(e) {
	        var char = e.char || String.fromCharCode(e.charCode);
	        if (!/^[A-Z0-9_]$/i.test(char)) {
	              e.preventDefault();
	              return false;
	            }
	          });
	
	          function parser(value) {
	            if (ctrl.$isEmpty(value)) {
	              return value;
	            }
	            var formatedValue = value.toUpperCase();
	            if (ctrl.$viewValue !== formatedValue) {
	              ctrl.$setViewValue(formatedValue);
	              ctrl.$render();
	            }
	            return formatedValue;
	          }
	
	          function formatter(value) {
	            if (ctrl.$isEmpty(value)) {
	              return value;
	            }
	            return value.toUpperCase();
	          }
	
	          ctrl.$formatters.push(formatter);
	          ctrl.$parsers.push(parser);
	        }
	      };
	    }
	  ]);