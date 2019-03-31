package com.qa.gateway.service;

import com.qa.gateway.entities.Booking;

public interface BookingServiceInterface {
	
	public String createBooking(Booking booking);
	public Booking readBooking(long id);
	public String updateBooking(long id,String endtime);
	public String deleteBooking(long id);

}
