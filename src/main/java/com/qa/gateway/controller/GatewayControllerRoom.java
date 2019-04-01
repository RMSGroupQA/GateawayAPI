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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.gateway.Constants;
import com.qa.gateway.entities.Room;

@RestController
public class GatewayControllerRoom {

	public GatewayControllerRoom(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;

	@PostMapping("/getters/createRoom")
	public String createRoom(@RequestBody Room room) {
		return restTemplate.postForEntity(Constants.CREATEROOM, room, String.class).getBody();
	}

	@GetMapping("/getters/readRoom/{id}")
	public String readRoom(@PathVariable("id") long id) {
		return restTemplate.getForEntity(Constants.READROOM + id, String.class).getBody();
	}

	@PutMapping("/getters/updateRoom/{id}")
	public String updateRoom(@PathVariable("id") long id, @RequestBody String password) {
		return restTemplate.exchange(Constants.UPDATEROOM + id, HttpMethod.PUT,
				new HttpEntity<String>(password, null), String.class).getBody();
	}

	@DeleteMapping("/getters/deleteRoom/{id}")
	public String deleteRoom(@PathVariable("id") long id) {
		return restTemplate.exchange(Constants.DELETEROOM + id, HttpMethod.DELETE, null, String.class).getBody();
	}
}
