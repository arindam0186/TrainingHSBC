<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.daos.*"%>
    
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2>Marksheet</h2>
<%
out.println(request.getParameter("studentName"));
%>

<ul>
<c:forEach items="${request.getParameter("marks")}" var="eachMark">
<li>${eachMark}</li>
</c:forEach>
</ul>

<a href="students">Back</a>

</body>
</html>