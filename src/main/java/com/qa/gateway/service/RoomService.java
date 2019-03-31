package com.qa.gateway.service;

import org.springframework.stereotype.Service;

import com.qa.gateway.entities.Booking;
import com.qa.gateway.entities.Room;
import com.qa.gateway.repo.BookingRepo;
import com.qa.gateway.repo.RoomRepo;

@Service
public class RoomService implements RoomServiceInterface{

	private RoomRepo roomRepo;

	public RoomService(RoomRepo roomRepo) {
		this.roomRepo = roomRepo;
	}

	public String createRoom(Room room) {
		this.roomRepo.save(room);
		return "Room has been successfully created.";
	}

	@Override
	public Room readRoom(long id) {
		if (roomRepo.existsById(id)) {
			return roomRepo.findById(id).get();
		}
		return null;

	}

	@Override
	public String updateRoom(long id, String endTime) {
		//TODO write method
		return null;
	}

	@Override
	public String deleteRoom(long id) {
		if (roomRepo.existsById(id)) {
			roomRepo.deleteById(id);
			return "Room deleted.";
		}
		return "Room doesn't exist.";

	}

}
