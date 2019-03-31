package com.qa.gateway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.entities.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {

}
