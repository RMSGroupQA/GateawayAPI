package com.qa.gateway.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.gateway.Constants;
import com.qa.gateway.entities.Employee;

@RestController
public class GatewayControllerEmployee {

	public GatewayControllerEmployee(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@CrossOrigin
	@PostMapping("/getters/createEmployee")
	public String createUser(@RequestBody Employee employee) {
		return restTemplate.postForEntity(Constants.CREATEEMPLOYEE, employee, String.class).getBody();
	}

	@CrossOrigin
	@GetMapping("/getters/readEmployee/{email}")
	public String readEmployee(@PathVariable("email") String email) {
		return restTemplate.getForEntity(Constants.READEMPLOYEE + email, String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeePassword/{email}")
	public String updatePassword(@PathVariable("email") String email, @RequestBody String password) {
		return restTemplate.exchange(Constants.UPDATEEMPLOYEEPASS + email, HttpMethod.PUT,
				new HttpEntity<String>(password, null), String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeeRole/{email}")
	public String updateRole(@PathVariable("email") String email, @RequestBody String role) {
		return restTemplate.exchange(Constants.UPDATEEMPLOYEEROLE + email, HttpMethod.PUT,
				new HttpEntity<String>(role, null), String.class).getBody();
	}

	@CrossOrigin
	@DeleteMapping("/getters/deleteEmployee/{email}")
	public String deleteEmployee(@PathVariable("email") String email) {
		return restTemplate.exchange(Constants.DELETEEMPLOYEE + email, HttpMethod.DELETE, null, String.class).getBody();
	}

}
