<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
<form action="register" method="get">
	employeename<input type="text" name="employeename"><br>
	city<input type="text" name="city"><br>
	salary<input type="text" name="salary"><br>
	mobile<input type="tel" name="mobile"><br>
	<select name="course">
	<option value="java">java</option>
	<option value="Html">Html</option>
	<option value="Spring">Spring</option>
	</select> 
	Hobbies
	<input type="checkbox" name="hobbies" value="sports">Sports
	<input type="checkbox" name="hobbies" value="music">music
	<input type="checkbox" name="hobbies" value="dance">dance
	<input type="checkbox" name="hobbies" value="travel">travel
	<br>
	<input type ="submit">
</form>

</body>
</html>