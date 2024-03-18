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
  <!-- Expression Language -->
  Welcome ${employee.employeeName}
  <br> city ${employee.employeeCity}
  <br> salary ${employee.employeeSalary}
  <br> EmployeeId ${employee.employeeId}
  
  <br>
  ${message } <br>
  ${message1 } <br>
  ${sessionScope.message1 } <br>

</body>
</html>