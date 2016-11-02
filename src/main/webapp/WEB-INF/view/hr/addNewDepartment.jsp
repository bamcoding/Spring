<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/HelloMVC/hr/doAddDepartmentAction">
	<label for="departmentId">부서번호: </label>
	<input type="text" name="departmentId" id="departmentId"/>
	<br/>
	<label for="departmentName">부서이름: </label>
	<input type="text" name="departmentName" id="departmentName"/>
	<br/>
	<input type="submit" value="등록"/>
</form>
</body>
</html>