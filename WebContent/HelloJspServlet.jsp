<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World Java EE</title>
</head>
<body>
    <h1>Hello JSP and Servlet!</h1>
<form action="helloServlet" method="post">
    Enter your name: <input type="text" name="yourName" size="20">
     Enter your choice: <input type="text" name="yourColor" size="20">
    <input type="submit" value="Call Servlet" />
</form>

<!-- <form action="helloServlet" method="get">
   
    <input type="submit" value="Submit" /> 
</form>-->

</body>
</html>