<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using Custom Tags</title>
</head>
<body>

<%

out.println(session.isNew());
out.println(session.getId());

%>

<c:set var="title" value="Jeevan Textiles"/>
<c:set var="loginPageTitle" value="Sign In Here" scope="session"/>

<h1 style="text-align: center;"><c:out value="${title}"/></h1>

<%-- <jsp:forward page="login.jsp"/> --%>

<a href="login.jsp">Login Page</a>
</body>
</html>