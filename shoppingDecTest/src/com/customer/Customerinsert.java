package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Customerinsert")
public class Customerinsert extends HttpServlet {

	// Class for registration of a new customer
	private static final long serialVersionUID = 1L;
	private static Connection con = null;
	// private static ResultSet rs = null;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();

		// Getting parameters from the jsp page
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");

		try {

			// Database connection
			con = DBConnect.getConnection();

			// SQL
			PreparedStatement ps = con.prepareStatement("INSERT INTO customer VALUES (0, ?, ?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setString(4, username);
			ps.setString(5, password);

			// InsertingTo Database
			int i = ps.executeUpdate();

			// Checking if the data created to the database
			if (i > 0) {
				// Printing success message
				RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
				dis.forward(request, response);
			}

			else {
				// Printing unsuccessful message
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}

			// Catching if there any errors
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		out.close();
	}

}
