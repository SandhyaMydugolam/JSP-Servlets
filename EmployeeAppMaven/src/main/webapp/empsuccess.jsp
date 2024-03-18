<%@page import="com.employeeapp.service.Employee"%>
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
  	Employee employee =(Employee)request.getAttribute("employee");
	out.println("Name: "+employee.getEmployeeName()+"<br>");
	out.println("empId: "+employee.getEmployeeId()+"<br>");
	out.println("empSalary: "+employee.getEmployeeSalary()+"<br>");
	out.println("employeeCity: "+employee.getEmployeeCity()+"<br>");
  %>

</body>
</html>