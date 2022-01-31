package com.details.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.TicketBooking;

public interface TicketBookingDAO extends JpaRepository<TicketBooking, Integer> {

	

	TicketBooking save(TicketBooking ticketbooking);

	List<TicketBooking> findAll();
}
