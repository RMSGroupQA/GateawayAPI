package com.qa.gateway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.entities.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
