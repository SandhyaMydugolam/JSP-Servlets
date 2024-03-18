package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String salary = request.getParameter("salary");
		double salary1 = Double.parseDouble(salary);
		String mobile = request.getParameter("mobile");
		long mobile1 = Long.parseLong(mobile);
		String course =request.getParameter("course");
		
		String hobbies[] =request.getParameterValues("hobbies");
		
//		PrintWriter writer = response.getWriter();
//		//create the html page manually
//		writer.print("<html><body>");
//		writer.print("your name is"+username+"<br>");
//		writer.print("your city is"+city+"<br>");
//		writer.print("your salary is"+salary+"<br>");
//		writer.print("your mobile is"+mobile+"<br>");
//		writer.print("your course"+course+"<br>");
//		for(String hobby : hobbies) {
//			writer.print(hobby+" ");
//		}
//		writer.print("</body></html>");
		
		//set attribute to send the object to the next page
		request.setAttribute("employeename", employeename);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("course", course);
		request.setAttribute("mobileNum", mobile1);
		request.setAttribute("hobbies", hobbies);
		PrintWriter  writer= response.getWriter();
		writer.print("This is from servlet<br>");
		
		//create the request dispatcher to send to the next page
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		//forward request and response
		dispatcher.include(request, response);
		
		
		
		
		
//		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
