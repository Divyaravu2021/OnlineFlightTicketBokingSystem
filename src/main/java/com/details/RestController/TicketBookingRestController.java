package com.details.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.TicketBooking;
import com.details.Service.TicketBookingService;

@RestController
public class TicketBookingRestController
{
	@Autowired
	TicketBookingService service;

	@PostMapping("/booking")
	public ResponseEntity<TicketBooking> createBooking(@Validated @RequestBody TicketBooking ticketbooking){
		
		System.out.println("Rest");
		TicketBooking e= service.addTicketBooking(ticketbooking);
		System.out.println(e);
		return new ResponseEntity<TicketBooking>(e,HttpStatus.OK);
	}


	@GetMapping("/booking")
	public ResponseEntity<List<TicketBooking>> fetchBooking()
	{
		List<TicketBooking> book=service.findAllBooking();
		return ResponseEntity.ok().body(book);
	}
	
	
	
//	@GetMapping("/booking/{id}")
//	public ResponseEntity<TicketBooking> findByBookingId(@PathVariable int id)
//	{
//		Optional<TicketBooking> book=service.findByBookingId(id);
//		if(book.isPresent())
//		{
//			return new ResponseEntity<>(book.get(),HttpStatus.OK);
//		}
//		else
//		{
//			throw new com.details.Excpetion.RecordNotFoundException("Record Not Found!");
//
//		}				
//	}
}