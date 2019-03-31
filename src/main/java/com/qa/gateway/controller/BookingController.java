package com.qa.gateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.gateway.entities.Booking;
import com.qa.gateway.service.BookingService;

@RestController
public class BookingController {

	private BookingService service;

	public BookingController(BookingService service) {
		this.service = service;
	}

	@CrossOrigin
	@PostMapping("/createBooking")
	public String createBooking(@RequestBody Booking booking) {
		return this.service.createBooking(booking);
	}

	@CrossOrigin
	@GetMapping("/readBooking/{id}")
	public String readBooking(@PathVariable("id") long id) {
		if (service.readBooking(id) != null) {
			return this.service.readBooking(id).toString();
		}
		return "Booking doesn't exist.";

	}

	@CrossOrigin
	@PutMapping("/updateBooking/{id}")
	public String updateBooking(@PathVariable("id") long id, @RequestBody String endTime) {
		return this.service.updateBooking(id, endTime);
	}

	@CrossOrigin
	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable("id") long id) {
		return this.service.deleteBooking(id);
	}

}
