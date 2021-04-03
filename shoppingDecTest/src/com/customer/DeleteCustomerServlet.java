package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Getting customer ID
		String id = request.getParameter("cusID");

		// Calling function deleteCustomer
		boolean isTrue = customerDBUtil.deleteCustomer(id);

		if (isTrue == true) {
			
			// Redirecting to registration page if query execution successfull
			RequestDispatcher dis = request.getRequestDispatcher("customerinsert.jsp");

			dis.forward(request, response);
		} else {
			
			// Redirecting to the previous page if the query execution unsuccessfull
			List<customer> cusDetails = customerDBUtil.getCustomerDetails(id);

			request.setAttribute("cusDetails", cusDetails);

			RequestDispatcher dis2 = request.getRequestDispatcher("useraccount.jsp");

			dis2.forward(request, response);
		}
	}

}
