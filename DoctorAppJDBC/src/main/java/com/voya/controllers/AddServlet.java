package com.voya.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.voya.model.Doctor;
import com.voya.repository.IDoctorService;
import com.voya.service.DoctorServiceIMPL;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	
	IDoctorService doctorService = new DoctorServiceIMPL();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String speciality = request.getParameter("speciality");
		String fees = request.getParameter("fees");
		double docFees = Double.parseDouble(fees);
		String doctorName = request.getParameter("doctorname");
		String docRat = request.getParameter("ratings");
		int ratings = Integer.parseInt(docRat);
		
		String docExp = request.getParameter("experience");
		int experience = Integer.parseInt(docExp);
		
		Doctor doctor = newDoctor();
		
		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(speciality);
		doctor.setFees(docFees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		doctorService.addDoctor(doctor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("addDoctor.jsp");
		dispatcher.forward(request, response);	
	}
	private Doctor newDoctor() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
