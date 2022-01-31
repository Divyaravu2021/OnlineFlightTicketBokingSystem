package com.details;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.details.Model.FlightTypes;
import com.details.Model.TicketBooking;
import com.details.Repository.TicketBookingDAO;
import com.details.Service.TicketBookingService;


@RunWith(SpringRunner.class)
@SpringBootTest

public class TicketBookingTest {
	
	@Autowired
	private TicketBookingService service;
	
	@MockBean
	private TicketBookingDAO repository;
	
	@Test
	public void getTicketBookingAddTest() {

		when(repository.findAll())
				.thenReturn(Stream.of(new TicketBooking( 8,"2022-12-19","nellore","pune","mysore airlines",10034,1000,"aditya")).collect(Collectors.toList()));

		assertEquals(1, service.findAllBooking().size());

	}
	
	

}
