<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Page - XYZ University</title>
</head>
<body>

<h1>Students List</h1>

<ol>
	<c:forEach items="${requestScope.studentList}" var="eachStudent">
	
	<c:set var="studentName" value="${eachStudent.getStudentName()}" scope="request"/>
	<c:set var="marks" value="${eachStudent.getMarksList()}" scope="request"/>
	
	<li><a href="marks.jsp?studentName=${studentName}">${studentName}</a><span> B.E. CSE 2019-2020</span></li>
	</c:forEach>
</ol>


</body>
</html>