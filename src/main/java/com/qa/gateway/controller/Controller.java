package com.qa.gateway.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	RestTemplateBuilder restBuilder;
	
	@GetMapping("/getters")
	public String getter() {
		return restBuilder.build().exchange("http;/localhost:8082/", HttpMethod.GET, null, String.class).getBody();
	}
	
	@GetMapping("/verify")
	public String verify() {
		return restBuilder.build().exchange("http;/localhost:8083/", HttpMethod.GET, null, String.class).getBody();
	}
	
	@GetMapping("/group")
	public String groupbooking() {
		return restBuilder.build().exchange("http;/localhost:8084/", HttpMethod.GET, null, String.class).getBody();
	}
	
	@GetMapping("/jms")
	public String jms() {
		return restBuilder.build().exchange("http;/localhost:8161/", HttpMethod.GET, null, String.class).getBody();
	}

}
