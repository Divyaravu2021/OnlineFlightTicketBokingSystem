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

import com.details.Model.FlightDetails1;
import com.details.Repository.FlightDetailsDAO;
import com.details.Service.FlightDetailsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightDetailsTest {
	
	@Autowired
	private FlightDetailsService Service;
	
	@MockBean
	private FlightDetailsDAO repository;

	@Test
	public void getFligtDetailsAndTest(){
		
		when(repository.findAll())
		.thenReturn(Stream.of(new FlightDetails1(10020,"nonja airport","hyderabad","pune","ecoomic","2020-09-12","08:09:00","10:02:00","mysoreailrines","boeng"))
				.collect(Collectors.toList()));
		assertEquals(1,Service.findAllflightdetails().size());
				
		
	}
	@Test
	public void getfindByflightnumber() {
		int flightnumber= 10;
		when(repository.findByflightnumber(flightnumber))
		.thenReturn(Stream.of(new FlightDetails1(10023)).collect(Collectors.toList()));

assertEquals(1, Service.findByflightnumber(flightnumber).size());
		
	}
	@Test
	public void getfindByairportname() {
		String airportname= "harikairport";
		when(repository.findByairportname(airportname))
		.thenReturn(Stream.of(new FlightDetails1("harikairport")).collect(Collectors.toList()));

assertEquals(1, Service.findByairportname(airportname).size());
	}
	@Test
	public void getfindByseattype() {
		String seattype= "economic";
		when(repository.findByseattype(seattype))
		.thenReturn(Stream.of(new FlightDetails1("economic")).collect(Collectors.toList()));

assertEquals(1, Service.findByseattype(seattype).size());
	}
	@Test
	public void getfindByflighttype() {
		String flighttype= "delight flight";
		when(repository.findByflighttype(flighttype))
		.thenReturn(Stream.of(new FlightDetails1("delight flight")).collect(Collectors.toList()));

assertEquals(1, Service.findByflighttype(flighttype).size());
	}
	
	
	
	

}
