package com.qa.gateway.entities;

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

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", forename=" + forename + ", lastname=" + lastname + ", role=" + role
				+ ", email=" + email + "]";
	}

}
