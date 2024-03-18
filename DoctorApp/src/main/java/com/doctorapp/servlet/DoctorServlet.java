package com.doctorapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/doctor")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String doctorName = request.getParameter("doctorName");
		String doctorId = request.getParameter("doctorId");
		int docId = Integer.parseInt(doctorId);
		String doctorFees = request.getParameter("doctorFees");
		double docfees=Double.parseDouble(doctorFees);
		String doctorspeciality = request.getParameter("speciality");
		String doctorrating = request.getParameter("doctorratings");
		int rating = Integer.parseInt(doctorrating);
		String doctorExperince = request.getParameter("doctorexperience");
		int experince = Integer.parseInt(doctorExperince);
		
		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctorName);
		doctor.setDoctorId(docId);
		doctor.setFees(docfees);
		doctor.setSpeciality(doctorspeciality);
		doctor.setRatings(rating);
		doctor.setExperience(experince);
		
		request.setAttribute("doctor", doctor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("doctorsuccess.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
