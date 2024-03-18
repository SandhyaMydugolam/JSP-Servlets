<%@ page import="java.util.*"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("message", "Great Day"); %>
<% String message=(String)request.getAttribute("message"); %>
<c:out value="Today is a${mess }"></c:out>

<h1>Today is a ${message }</h1><br>


<c:set var="mess" value="Good day" scope="session"></c:set>
${sessionScope.mess  }
<c:out value="Today is a${mess }"></c:out>

<% List<String>fruits = 
		Arrays.asList("apple","grapes","mango","kiwi","banana");
session.setAttribute("fruitsList",fruits);
%>
<h2>using EL</h2>
${fruits  }<br>
<h2>Using c:forEach</h2>
<c:forEach items="${fruits }" var="fruit" step="2">
${fruit }<br>
</c:forEach>c:forEach>
</body>
</html>