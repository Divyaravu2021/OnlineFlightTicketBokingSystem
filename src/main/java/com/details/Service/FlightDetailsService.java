package com.details.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import com.details.Model.FlightDetails1;

public interface FlightDetailsService {

	FlightDetails1 addFlightDetails(FlightDetails1 flightdetails);

	List<FlightDetails1> findAllflightdetails();

	
	Optional<FlightDetails1> findBytocity(String tocity);

	Optional<FlightDetails1> findByfromcity(String fromcity);

	Optional<FlightDetails1> findBydate(java.util.Date date);

	List<FlightDetails1> findByarrivaltime(Time arrivaltime);

	List<FlightDetails1> findBydeparturetime(Time departuretime);

	List<FlightDetails1> findByairportname(String airportname);

	List<FlightDetails1> findByflighttype(String flighttype);

	List<FlightDetails1> findByseattype(String seattype);
	
	
	Optional<FlightDetails1> findByflightname(String flightname);

	FlightDetails1 updateFlightDetails1(FlightDetails1 flightdetails);

	List<FlightDetails1> findByflightnumber(int flightnumber);

	FlightDetails1 save(Optional<FlightDetails1> flightdetails);

	Optional<FlightDetails1> delete(int flightnumber);



}
