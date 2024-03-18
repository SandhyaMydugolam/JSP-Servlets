package com.empapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee;

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
		
		String employeename = request.getParameter("employeename");
		String city = request.getParameter("city");
		String employeeId = request.getParameter("employeeId");
		int employeeId1 = Integer.parseInt(employeeId);
		String salary = request.getParameter("salary");
		double salary1 = Double.parseDouble(salary);
		String course = request.getParameter("language");
		
		// create Employee and Set Values
		Employee employee = new Employee();
		employee.setEmployeename(employeename);
		employee.setEmployeeid(employeeId1);
		employee.setCourse(course);
		employee.setCity(city);
		employee.setSalary(salary1);
		
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("empsuccess.jsp");
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
