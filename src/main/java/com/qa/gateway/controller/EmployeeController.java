package com.qa.gateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.gateway.entities.Employee;
import com.qa.gateway.service.EmployeeService;

public class EmployeeController {

	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@CrossOrigin
	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		return this.service.createEmployee(employee);
	}

	@CrossOrigin
	@GetMapping("/readEmployee/{id}")
	public String readEmployee(@PathVariable("id") long id) {
		if (service.readEmployee(id) != null) {
			return this.service.readEmployee(id).toString();
		}
		return "Employee doesn't exist.";

	}

	@CrossOrigin
	@PutMapping("/updateEmployeeRole/{id}")
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateRole(id, role);
	}

	@CrossOrigin
	@PutMapping("/updateEmployeePassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return this.service.updatePassword(id, password);
	}

	@CrossOrigin
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		return this.service.deleteEmployee(id);
	}

}
