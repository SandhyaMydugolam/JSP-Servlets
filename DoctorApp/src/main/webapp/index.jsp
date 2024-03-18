<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doctor" >
	Doctor Name:<input type="text" name="doctorName"><br>
	Doctor Id:<input type="number" name="doctorId"><br>
	Doctor Fees:<input type="number" name="doctorFees"><br>
	Doctor speciality
	<select name ="speciality">
		<option value="Cardiologist">Cardiologist</option>
		<option value="Pediatrician">Pediatrician</option>
		<option value="Dermatologist">Dermatologist</option>
		<option value="Neurologist">Neurologist</option>
		<option value="Gynecologist">Gynecologist</option>
		<option value="psychiatrist">psychiatrist</option>
	</select><br>
	Doctor ratings:<input type="text" name="doctorratings"><br>
	Doctor experience:<input type="text" name="doctorexperience"><br>
	<input type="submit">
	
	</form>


</body>
</html>