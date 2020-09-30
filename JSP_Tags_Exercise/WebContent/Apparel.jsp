<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.models.*"%>
    
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apparel Page</title>
</head>
<body>

<%

Products product = new Products();

%>
<h2>Apparels</h2>

<form action="" method="post">

<div>
<label>T-Shirt</label>
<input type="radio" name="apparel" value="Tshirt">
</div>

<div>
<label>Jeans</label>
<input type="radio" name="apparel" value="Jeans">
</div>

<div>
<label>Cap</label>
<input type="radio" name="apparel" value="Cap">
</div>

<div>
	<input type="reset">
	<input type="submit" value="Submit">
</div>

</form>

<c:set var="apparel" value="${param.apparel}" scope="session"/>

<a href="Electronics.jsp">Electronics</a>
<a href="FoodItem.jsp">Food Item</a>
<a href="Bill.jsp">Bill</a>

<h4>You bought: <c:out value="${apparel}"></c:out></h4>

</body>
</html>