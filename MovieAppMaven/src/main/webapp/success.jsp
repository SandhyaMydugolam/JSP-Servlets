<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("sessionId "+session.getId()+"<br>");
	out.println("Maxinactive "+session.getId()+"<br>");
	String username = (String)session.getAttribute("username");
	session.setMaxInactiveInterval(1);
	out.print("Welcome "+username);
	%>
	<form action="movieservlet">
	select category :
	<select name = "language">
	<option value="Telugu">Telugu</option>
	<option value="Kannada">Kannada</option>
	<option value="Marati">Marati</option>
	<option value="Tamil">Tamil</option>
	<option value="Hindi">Hindi</option>
	
	</select><br>
	<input type = "submit">
	</form>
	
</body>
</html>