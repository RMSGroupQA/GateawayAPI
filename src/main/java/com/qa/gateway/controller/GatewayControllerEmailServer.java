package com.qa.gateway.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.qa.gateway.Constants;
import com.qa.gateway.entities.Employee;

public class GatewayControllerEmailServer {
	
	public GatewayControllerEmailServer(RestTemplateBuilder restBuilder) {
		this.restTemplate = restBuilder.build();
	}

	RestTemplate restTemplate;
	
	

}
