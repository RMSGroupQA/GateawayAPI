package com.qa.gateway.service;

import org.springframework.stereotype.Service;

import com.qa.gateway.entities.Booking;
import com.qa.gateway.entities.Employee;
import com.qa.gateway.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	private EmployeeRepo repo;
	
	public EmployeeService(EmployeeRepo repo) {
		this.repo = repo;
	}

	@Override
	public String createEmployee(Employee employee) {
		this.repo.save(employee);
		return employee.getForename()+" "+employee.getLastname()+", you now have an account.";
	}

	@Override
	public Employee readEmployee(long id) {
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		}
		return null;
	}

	@Override
	public String updateRole(long id, String role) {
		if (repo.existsById(id)) {
			Employee aUser = readEmployee(id);
			aUser.setRole(role);
			repo.save(aUser);
			return aUser.getForename()+" "+aUser.getLastname()+"'s role has been changed to "+ role+".";
		}

		return "Employee doesn't exist.";
	}

	@Override
	public String updatePassword(long id, String password) {
		if (repo.existsById(id)) {
			Employee aUser = readEmployee(id);
			aUser.setPassword(password);
			repo.save(aUser);
			return aUser.getForename()+" "+aUser.getLastname()+"'s password has been changed.";
		}

		return "Employee doesn't exist.";
	}

	@Override
	public String deleteEmployee(long id) {
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return "Employee deleted.";
		}
		return "Employee doesn't exist.";
	}

}
