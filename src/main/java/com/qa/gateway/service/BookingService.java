package com.qa.gateway.service;

import org.springframework.stereotype.Service;

import com.qa.gateway.entities.Booking;
import com.qa.gateway.repo.BookingRepo;

@Service
public class BookingService implements BookingServiceInterface {

	private BookingRepo repo;

	public BookingService(BookingRepo repo) {
		this.repo = repo;
	}

	public String createBooking(Booking booking) {
		this.repo.save(booking);
		return "Booking has been successfully created.";
	}

	@Override
	public Booking readBooking(long id) {
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		}
		return null;

	}

	@Override
	public String updateBooking(long id, String endTime) {

		if (repo.existsById(id)) {
			Booking aBook = readBooking(id);
			aBook.setEndTime(endTime);
			repo.save(aBook);
			return "End time has been changed.";
		}

		return "Booking doesn't exist.";
	}

	@Override
	public String deleteBooking(long id) {
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return "Booking deleted.";
		}
		return "Booking doesn't exist.";

	}

}
