package com.qa.gateway.service;

import com.qa.gateway.entities.Employee;

public interface EmployeeServiceInterface {
	
	public String createEmployee(Employee employee);
	public Employee readEmployee(long id);
	public String updateRole(long id,String role);
	public String updatePassword(long id,String password);
	public String deleteEmployee(long id);

}
