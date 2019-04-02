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

	@GetMapping("/getters/readRoom/{roomName}")
	public String readRoom(@PathVariable("roomName") String roomName) {
		return restTemplate.getForEntity(Constants.READROOM + roomName, String.class).getBody();
	}

	@DeleteMapping("/getters/deleteRoom/{roomName}")
	public String deleteRoom(@PathVariable("roomName") String roomName) {
		return restTemplate.exchange(Constants.DELETEROOM + roomName, HttpMethod.DELETE, null, String.class).getBody();
	}
}
