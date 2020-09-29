<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>

<h1>Success - Welcome to MySite</h1>

<span>Invoice Number = </span>${invoiceObject.invoiceNumber} 
<br>
<span>Customer Name = </span>${invoiceObject.customerName}
<br>
<span>Amount = </span>${invoiceObject.amount}
<br>

<a href="AddInvoice.html">Add Invoice</a>

</body>
</html>