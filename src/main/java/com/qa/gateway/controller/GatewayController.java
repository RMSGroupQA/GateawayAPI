package com.qa.gateway.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.gateway.Constants;
import com.qa.gateway.entities.Employee;

@RestController
public class GatewayController {

	public GatewayController(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@PostMapping("/getters/createEmployee")
	public String createUser(@RequestBody Employee employee) {
		return restTemplate.postForEntity(Constants.CREATEEMPLOYEE, employee, String.class).getBody();
	}

	@GetMapping("/getters/readEmployee/{id}")
	public String readEmployee(@PathVariable("id") long id) {
		return restTemplate.getForEntity(Constants.READEMPLOYEE + id, String.class).getBody();
	}
	
	@PutMapping("/getters/updateEmployeePassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return restTemplate.exchange(Constants.UPDATEEMPLOYEEPASS + id, HttpMethod.PUT, 
				new HttpEntity<String>(password, null), String.class).getBody();
	}
	
	@PutMapping("/getters/updateEmployeeRole/{id}")
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return restTemplate.exchange(Constants.UPDATEEMPLOYEEROLE + id, HttpMethod.PUT, 
				new HttpEntity<String>(role, null), String.class).getBody();
	}
	
	@DeleteMapping("/getters/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		return restTemplate.exchange(Constants.DELETEEMPLOYEE + id, HttpMethod.DELETE, 
				null, String.class).getBody();
	}

	@RequestMapping("/verify")
	public String verify() {
		return restTemplate.exchange("http://localhost:8083/", HttpMethod.GET, null, String.class).getBody();
	}

	@RequestMapping("/group")
	public String groupbooking() {
		return restTemplate.exchange("http://localhost:8084/", HttpMethod.GET, null, String.class).getBody();
	}

}
