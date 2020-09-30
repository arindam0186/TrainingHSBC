<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>
</head>
<body>

<h2>Details...</h2>
<%= session.getAttribute("id") %>
<%= session.getAttribute("name") %>

</body>
</html>