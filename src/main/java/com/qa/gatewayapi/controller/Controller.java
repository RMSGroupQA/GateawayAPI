package com.qa.gatewayapi.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	public Controller(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@CrossOrigin
	@PostMapping("/getters/createEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		return restTemplate.postForEntity("http://localhost:8082/createEmployee", employee, String.class).getBody();
	}

	@CrossOrigin
	@GetMapping("/getters/readEmployee/{id}")
	public String readEmployee(@PathVariable("id") long id) {
		return restTemplate.getForEntity("http://localhost:8082/readEmployee/" + id, String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeePassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return restTemplate.exchange("http://localhost:8082/updateEmployeePassword/" + id, HttpMethod.PUT, 
				new HttpEntity<String>(password, null), String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeeRole/{id}")
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return restTemplate.exchange("http://localhost:8082/updateEmployeeRole/" + id, HttpMethod.PUT, 
				new HttpEntity<String>(role, null), String.class).getBody();
	}

	@CrossOrigin
	@DeleteMapping("/getters/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		return restTemplate.exchange("http://localhost:8082/deleteEmployee/" + id, HttpMethod.DELETE, 
				null, String.class).getBody();
	}

	@CrossOrigin
	@PostMapping("/getters/createBooking")
	public String createBooking(@RequestBody Employee employee) {
		return restTemplate.postForEntity("http://localhost:8082/createBooking/", employee, String.class).getBody();
	}

	@CrossOrigin
	@GetMapping("/getters/readBooking/{id}")
	public String readBooking(@PathVariable("id") long id) {
		return restTemplate.getForEntity("http://localhost:8082/readBooking/" + id, String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/getters/updateEndTime/{id}")
	public String updateBookingRole(@PathVariable("id") long id, @RequestBody String endTime) {
		return restTemplate.exchange("http://localhost:8082/updateBooking/" + id, HttpMethod.PUT, 
				new HttpEntity<String>(endTime, null), String.class).getBody();
	}

	@CrossOrigin
	@DeleteMapping("/getters/deleteBooking/{id}")
	public String deleteBooking(@PathVariable("id") long id) {
		return restTemplate.exchange("http://localhost:8082/deleteBooking/" + id, HttpMethod.DELETE, 
				null, String.class).getBody();
	}

	@CrossOrigin
	@PostMapping("/getters/createRoom")
	public String createRoom(@RequestBody Employee employee) {
		return restTemplate.postForEntity("http://localhost:8082/createRoom", employee, String.class).getBody();
	}

	@CrossOrigin
	@GetMapping("/getters/readRoom/{id}")
	public String readRoom(@PathVariable("id") long id) {
		return restTemplate.getForEntity("http://localhost:8082/readRoom/" + id, String.class).getBody();
	}

//	@CrossOrigin
//	@PutMapping("/getters/updateRoom/{id}")
//	public String updateRoom(@PathVariable("id") long id, @RequestBody String password) {
//		return restTemplate.exchange("http://localhost:8082/updateRoom/" + id, HttpMethod.PUT, 
//				new HttpEntity<String>(password, null), String.class).getBody();
//	}

	@CrossOrigin
	@DeleteMapping("/getters/deleteRoom/{id}")
	public String deleteRoom(@PathVariable("id") long id) {
		return restTemplate.exchange("http://localhost:8082/deleteRoom/" + id, HttpMethod.DELETE, 
				null, String.class).getBody();
	}

	@CrossOrigin
	@RequestMapping("/getters")
	public String getter() {
		return restTemplate.exchange("http://localhost:8082/", HttpMethod.PUT, null, String.class).getBody();
	}

	@CrossOrigin
	@RequestMapping("/verify")
	public String verify() {
		return restTemplate.exchange("http://localhost:8083/", HttpMethod.GET, null, String.class).getBody();
	}

	@CrossOrigin
	@RequestMapping("/group")
	public String groupbooking() {
		return restTemplate.exchange("http://localhost:8084/", HttpMethod.GET, null, String.class).getBody();
	}

}
