package com.qa.gatewayapi.controller;

import java.util.Set;

public class Employee {

	private long employeeID;
	private Set<Booking> bookings;
	
	private String forename;
	private String lastname;
	private String password;
	private String role;
	private String email;
	
	
	public long getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

//	public User(String forename, String lastname, String password, String role, String email) {
//		super();
//		this.forename = forename;
//		this.lastname = lastname;
//		this.password = password;
//		this.role = role;
//		this.email = email;
//	}

}
