package com.qa.gateway.service;

import com.qa.gateway.entities.Room;

public interface RoomServiceInterface {
	
	public String createRoom(Room room);
	public Room readRoom(long id);
	public String updateRoom(long id,String building);
	public String deleteRoom(long id);

}
