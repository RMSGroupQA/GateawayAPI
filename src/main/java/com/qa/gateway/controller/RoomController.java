package com.qa.gateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.gateway.entities.Room;
import com.qa.gateway.service.RoomService;

@RestController
public class RoomController {
	
	private RoomService service;

	public RoomController(RoomService service) {
		this.service = service;
	}

	@CrossOrigin
	@PostMapping("/createRoom")
	public String createRoom(@RequestBody Room room) {
		return this.service.createRoom(room);
	}

	@CrossOrigin
	@GetMapping("/readRoom/{id}")
	public String readRoom(@PathVariable("id") long id) {
		if (service.readRoom(id) != null) {
			return this.service.readRoom(id).toString();
		}
		return "Room doesn't exist.";

	}

//	@CrossOrigin
//	@PutMapping("/updateRoom/{id}")
//	public String updateRoom(@PathVariable("id") long id, @RequestBody String role) {
//		return this.service.updateRoom(id, role);
//	}

	@CrossOrigin
	@DeleteMapping("/deleteRoom/{id}")
	public String deleteRoom(@PathVariable("id") long id) {
		return this.service.deleteRoom(id);
	}

}
