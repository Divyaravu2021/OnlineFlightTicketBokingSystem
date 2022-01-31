package com.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.TicketBooking;
import com.details.Repository.TicketBookingDAO;



@Service
public class TicketBookingServiceimpl implements TicketBookingService {
	@Autowired
	TicketBookingDAO dao;
    public TicketBooking addTicketBooking(TicketBooking book) {
		TicketBooking e = dao.save(book);
		return e;
	}

//	@Override
//	public Optional<TicketBooking> findByBookingId(int id) {
//		Optional<TicketBooking> a = dao.findByBookingId(id);
//		return a;
//	}

	@Override
	public List<TicketBooking> findAllBooking() {
		List<TicketBooking> e = dao.findAll();
		return e;
	}

	
	
}
