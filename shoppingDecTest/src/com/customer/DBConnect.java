package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	// This class make the database connection
	private static String url = "jdbc:mysql://localhost:3306/shoppingdec";
	private static String user = "root";
	private static String pass = "thusitha01";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);						
		} catch (Exception e) {
			System.out.println("Database Connection is not successful!!!");
		}
		
		return con;
	}
}
