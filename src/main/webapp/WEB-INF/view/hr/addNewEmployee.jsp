<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/HelloMVC/hr/doAddEmployeeAction">
		
		<label for="employeeId">사번: </label>
		<input type="text" id="employeeId" name="employeeId" />
		<br/>
		<label for="lastName">이름: </label>
		<input type="text" id="lastName" name="lastName" />
		<br/>

		<label for="email">이메일: </label>
		<input type="text" id="email" name="email" />
		<br/>

		<label for="jobId">직무 번호: </label>
		<input type="text" id="jobId" name="jobId" />
		<br/>
		<input type="submit" value="전송"/>
		
	</form>
</body>
</html>