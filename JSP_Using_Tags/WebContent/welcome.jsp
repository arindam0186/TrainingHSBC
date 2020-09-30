<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<h4><c:out value="${loginPageTitle}"/></h4>
<h5><c:out value="${frmServlet}"/></h5>


<ol>

<c:forEach items="${requestScope.nameList}" var="eachName">
<li>${eachName}</li>
</c:forEach>

</ol>

<h4><c:out value="${loginPageTitle}"/></h4>

<%

out.println(session.isNew());
out.println(session.getId());

%>

</body>
</html>