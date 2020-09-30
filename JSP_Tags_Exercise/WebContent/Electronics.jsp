<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.models.*"%>
    
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electronics Page</title>
</head>
<body>

<h2>Electronics</h2>

<form action="" method="post">

<div>
<label>TV</label>
<input type="radio" name="electronics" value="TV">
</div>

<div>
<label>Mobile</label>
<input type="radio" name="electronics" value="Mobile">
</div>

<div>
<label>Laptop</label>
<input type="radio" name="electronics" value="Laptop">
</div>

<div>
	<input type="reset">
	<input type="submit" value="Submit">
</div>

</form>

<c:set var="electronics" value="${param.electronics}" scope="session"/>


<a href="Apparel.jsp">Apparel</a>
<a href="FoodItem.jsp">Food Item</a>
<a href="Bill.jsp">Bill</a>

<h4>You bought: <c:out value="${electronics}"></c:out></h4>


</body>
</html>