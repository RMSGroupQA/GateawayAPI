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
import com.qa.gateway.entities.Booking;

@RestController
public class GatewayControllerBooking {

	public GatewayControllerBooking(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@CrossOrigin
	@PostMapping("/createBooking")
	public String createUser(@RequestBody Booking booking) {
		return restTemplate.postForEntity(Constants.CREATEBOOKING, booking, String.class).getBody();
	}

	@CrossOrigin
	@GetMapping("/readBooking/{id}")
	public String readEmployee(@PathVariable("id") long id) {
		return restTemplate.getForEntity(Constants.READBOOKING + id, String.class).getBody();
	}

	@CrossOrigin
	@PutMapping("/updateBooking/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String endtime) {
		return restTemplate.exchange(Constants.UPDATEBOOKING + id, HttpMethod.PUT,
				new HttpEntity<String>(endtime, null), String.class).getBody();
	}

	@CrossOrigin
	@DeleteMapping("/deleteBooking/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		return restTemplate.exchange(Constants.DELETEBOOKING + id, HttpMethod.DELETE, null, String.class).getBody();
	}
}
