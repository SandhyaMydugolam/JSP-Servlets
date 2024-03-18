package com.employee.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeeapp.service.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String employeeName = request.getParameter("employeeName");
		String employeeId = request.getParameter("employeeId");
		int empId = Integer.parseInt(employeeId);
		String employeeSalary = request.getParameter("employeeSalary");
		double empSalary=Double.parseDouble(employeeSalary);
		String employeeCity = request.getParameter("employeeCity");
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeId(empId);
		employee.setEmployeeSalary(empSalary);
		employee.setEmployeeCity(employeeCity);
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "Great Day");
		HttpSession session =request.getSession();
		session.setAttribute("message1", "Welcome to EL");
		request.setAttribute("message1", "In request to scope");
		RequestDispatcher dispatcher = request.getRequestDispatcher("empexplang.jsp");
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
