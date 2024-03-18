<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
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
		out.print("Welcome "+username);
	String language = (String)request.getAttribute("language");
		List<String> movies = (List)request.getAttribute("movies");
		out.print("language "+language);
		for (String movies1 : movies ){
		out.print(movies1+ " ");
		}
		%>

</body>
</html>