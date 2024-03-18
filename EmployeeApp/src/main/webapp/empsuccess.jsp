<%@ page import="com.empapp.model.Employee"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Employee employee =(Employee) request.getAttribute("employee");

String name = employee.getEmployeename();
out.print("Welcome "+name+ "<br>");
String city = employee.getCity();
out.print("city "+city + "<br>");

Integer employeeId = employee.getEmployeeid();
out.print("EmployeeId "+employeeId + "<br>");
double salary = employee.getSalary();
out.print("salary "+salary +"<br>");
String course = employee.getCourse();
out.print("course "+course + "<br>");

%>
</body>
</html>