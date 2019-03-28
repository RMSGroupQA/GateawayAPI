package com.qa.gateway.entities;

public class Booking {

	private long bookingID;
	
	private Room room;
	
	private User user;

	private String startTime;
	private String endTime;
	private int numberOfPeople = 1;
	private String title;
	private String description;
	
	public long getBookingID() {
		return bookingID;
	}
	
	public Room getRoom() {
		return room;
	}

	public User getUser() {
		return user;
	}

	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", numberOfPeople=" + numberOfPeople + ", title=" + title + ", description=" + description + "]";
	}

	public Booking() {
		
	}

	
}
