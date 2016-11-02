<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background:black;color:white;background-image: url(/HelloMVC/img/007빵.jpg);background-repeat:no-repeat;background-position: center;">
<c:if test="${not empty allDepartments}">
	<c:forEach var="department" items="${allDepartments}">
		${department.departmentId } /
		${department.departmentName } /
		${department.managerId } /
		${department.locationId } /
		<br/>
	</c:forEach>
</c:if>
<c:if test="${not empty department}">
		${department.departmentId } /
		${department.departmentName } /
		${department.managerId } /
		${department.locationId } /
</c:if>
</body>
</html>