<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Page</title>
</head>
<body>

<h2>Total Bill</h2>
<h5><c:out value="${apparel}"/></h5>
<h5><c:out value="${foodItems}"/></h5>
<h5><c:out value="${electronics}"/></h5>

<a href="index.jsp">Done Shopping?</a>

<%
session.invalidate();
%>
</body>
</html>