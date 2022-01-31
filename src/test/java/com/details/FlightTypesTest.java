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
import com.details.Repository.FlightTypesDAO;
import com.details.Service.FlightTypesService;

@RunWith(SpringRunner.class)
@SpringBootTest
  public class FlightTypesTest {
	@Autowired
	private FlightTypesService Service;

	@MockBean
	private FlightTypesDAO repository;

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void getFlightTypesAddTest() {

		when(repository.findAll())
				.thenReturn(Stream.of(new FlightTypes("divya aircraft", 8)).collect(Collectors.toList()));

		assertEquals(1, Service.findAll().size());

	}
	@Test
	public void getfindByaircraft() {
		String aircraft="mohan aircraft";
		when(repository.findByaircraft(aircraft))
		.thenReturn(Stream.of(new FlightTypes("mohan aircraft", 8)).collect(Collectors.toList()));

assertEquals(1, Service.findByaircraft(aircraft).size());
		
	}
	@Test
	public void getfindBynoofseats() {
		int noofseats= 10;
		when(repository.findBynoofseats(noofseats))
		.thenReturn(Stream.of(new FlightTypes("divya aircraft", 10)).collect(Collectors.toList()));

assertEquals(1, Service.findBynoofseats(noofseats).size());
		
	}
}
