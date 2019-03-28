package com.qa.gateway.controller;

import java.util.Set;

public class Room {

	private long roomID;
	private Set<Booking> bookings;

	private String building;
	private String floor;
	private String roomName;
	private int numOfSeats;
	private int numOfComputers;

	public long getRoomID() {
		return roomID;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public int getNumOfComputers() {
		return numOfComputers;
	}

	public void setNumOfComputers(int numOfComputers) {
		this.numOfComputers = numOfComputers;
	}

	public Room() {

	}

	public Room(String building, String floor, String roomName, int numOfSeats, int numOfComputers) {
		super();
		this.building = building;
		this.floor = floor;
		this.roomName = roomName;
		this.numOfSeats = numOfSeats;
		this.numOfComputers = numOfComputers;
	}

}
