<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-img:url(/HelloMVC/img/쯔위.gif);">
	<form:form  commandName="employeesVO"
				method="post" 
				action="/HelloMVC/hr/doAddEmployeeAction">
		
		<label for="employeeId">사번: </label>
		<input type="text" id="employeeId" name="employeeId" /><br/>
		<form:errors path="employeeId" cssStyle="color:red"></form:errors><br/>
		
		<label for="lastName">이름: </label>
		<input type="text" id="lastName" name="lastName" /><br/>
		<form:errors path="lastName"></form:errors><br/>

		<label for="email">이메일: </label>
		<input type="text" id="email" name="email" /><br/>
		<form:errors path="email"></form:errors><br/>

		<label for="jobId">직무 번호: </label>
		<input type="text" id="jobId" name="jobId" /><br/>
		<form:errors path="jobId"></form:errors><br/>
		<input type="submit" value="전송"/>
		
	</form:form>
</body>
</html>