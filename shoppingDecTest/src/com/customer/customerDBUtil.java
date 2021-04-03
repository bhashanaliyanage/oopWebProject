package com.customer;

import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDBUtil {
	
	// This class is the one that are dealing with the database
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<customer> validate(String username, String password) {
		ArrayList<customer> cus = new ArrayList<>();

		// validation
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "SELECT * FROM customer WHERE username='" + username + "' and password='" + password + "'";

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				customer c = new customer(id, name, email, phone, userU, passU);

				cus.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cus;
	}

	public static boolean updateCustomer(String id, String name, String phone, String email, String username,
			String password) {
		boolean isSuccess = false;
		// nt idINT = Integer.parseInt(id);

		try {
			// testing
			System.out.println("ID: " + id);

			// DBConnection
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// SQLQuerry

			String sql = "UPDATE customer SET name='" + name + "', email='" + email + "', phone='" + phone
					+ "', username='" + username + "', password='" + password + "'" + "where id='" + id + "'";

			// Inserting Querry to Database
			int rs = stmt.executeUpdate(sql);

			// Checking if the data created to the database
			if (rs > 0) {
				// Returning success message
				isSuccess = true;
			}

			else {
				// Returning unsuccessful message
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	public static List<customer> getCustomerDetails(String id) {
		int convertedID = Integer.parseInt(id);

		ArrayList<customer> cus = new ArrayList<>();

		try {
			// database connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// SQL
			String sql = "SELECT * FROM customer WHERE id='" + convertedID + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);

				customer c = new customer(id1, name, email, phone, username, password);
				cus.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cus;
	}

	public static boolean deleteCustomer(String id) {
		boolean isSuccess = false;
		int convertedID = Integer.parseInt(id);

		try {
			// DBConnection
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// SQL
			String sql = "DELETE FROM customer WHERE id='" + convertedID + "'";

			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}
}
