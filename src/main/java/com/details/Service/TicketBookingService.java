package com.details.Service;

import java.util.List;
import java.util.Optional;

import com.details.Model.TicketBooking;

public interface TicketBookingService {

	TicketBooking addTicketBooking(TicketBooking book);

	

	List<TicketBooking> findAllBooking();



	

}
