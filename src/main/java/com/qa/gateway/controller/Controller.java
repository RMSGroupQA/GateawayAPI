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

@RestController
public class Controller {

	public Controller(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@PostMapping("/getters/createUser")
	public String createUser(@RequestBody User user) {
		return restTemplate.postForEntity("http://localhost:8082/createUser", user, String.class).getBody();
	}

	@GetMapping("/getters/readUser/{id}")
	public String readUser(@PathVariable("id") long id) {
		return restTemplate.getForEntity("http://localhost:8082/readUser/" + id, String.class).getBody();
	}
	
	@PutMapping("/getters/updateUserPassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return restTemplate.exchange("http://localhost:8082/updateUserPassword/" + id, HttpMethod.PUT, 
				new HttpEntity<String>(password, null), String.class).getBody();
	}
	
	@PutMapping("/getters/updateUserRole/{id}")
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return restTemplate.exchange("http://localhost:8082/updateUserRole/" + id, HttpMethod.PUT, 
				new HttpEntity<String>(role, null), String.class).getBody();
	}
	
	@DeleteMapping("/getters/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") long id) {
		return restTemplate.exchange("http://localhost:8082/deleteUser/" + id, HttpMethod.DELETE, 
				null, String.class).getBody();
	}

	@RequestMapping("/getters")
	public String getter() {
		return restTemplate.exchange("http://localhost:8082/", HttpMethod.PUT, null, String.class).getBody();
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
