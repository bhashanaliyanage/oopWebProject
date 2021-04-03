package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Getting user ID and password from JSP page
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");

		try {
			
			// Calling validate function in DBUtil
			List<customer> cusDetails = customerDBUtil.validate(username, password);
			request.setAttribute("cusDetails", cusDetails);
		} catch (Exception e) {
			
			// Printing errors id there any...
			e.printStackTrace();
		}
		
		// Directing to user profile...
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
	}

}