<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.models.*"%>
    
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food Page</title>
</head>
<body>

<h2>Food Items</h2>

<form action="" method="post">

<div>
<label>Pizza</label>
<input type="radio" name="foodItems" value="Pizza">
</div>

<div>
<label>Burger</label>
<input type="radio" name="foodItems" value="Burger">
</div>

<div>
<label>Pasta</label>
<input type="radio" name="foodItems" value="Pasta">
</div>

<div>
	<input type="reset">
	<input type="submit" value="Submit">
</div>

</form>

<c:set var="foodItems" value="${param.foodItems}" scope="session"/>


<a href="Electronics.jsp">Electronics</a>
<a href="Apparel.jsp">Apparel</a>
<a href="Bill.jsp">Bill</a>

<h4>You bought: <c:out value="${foodItems}"></c:out></h4>


</body>
</html>