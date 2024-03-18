<%@page import="com.doctorapp.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Doctor Details</h2>
<%
 Doctor doctor =(Doctor)request.getAttribute("doctor");
out.println("Name: "+doctor.getDoctorName()+"<br>");
out.println("DoctorId: "+doctor.getDoctorId()+"<br>");
out.println("DoctorFees: "+doctor.getFees()+"<br>");
out.println("Doctor Speciality: "+doctor.getSpeciality()+"<br>");
out.println("Rating : "+doctor.getRatings()+"<br>");
out.println("Experience : "+doctor.getExperience());
%>

</body>
</html>