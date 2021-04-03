package com.customer;

// All of the customer information are stored in this class
public class customer {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	public customer(int id, String name, String email, String phone, String username, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}