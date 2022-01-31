package com.details.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.FlightDetails1;
import com.details.Model.FlightTypes;

public interface FlightDetailsDAO extends JpaRepository<FlightDetails1, Integer> {

	FlightDetails1 save(FlightDetails1 flightdetails);
	

	List<FlightDetails1> findAll();

	List<FlightDetails1> findByflightnumber(int flightnumber);

	Optional<FlightDetails1> findByfromcity(String fromcity);

	Optional<FlightDetails1> findBytocity(String tocity);

	Optional<FlightDetails1> findByflightname(String flightname);

	Optional<FlightDetails1> findBydate(java.util.Date date);

	List<FlightDetails1> findByarrivaltime(Time arrivaltime);

	List<FlightDetails1> findBydeparturetime(Time departuretime);

	List<FlightDetails1> findByflighttype(String flighttype);

	List<FlightDetails1> findByseattype(String seattype);

	List<FlightDetails1> findByairportname(String airportname);

	

}
