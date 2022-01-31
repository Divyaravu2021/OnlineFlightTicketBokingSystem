package com.details.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.FlightDetails1;
import com.details.Repository.FlightDetailsDAO;

@Service
public class FlightDetailsServiceimpl implements FlightDetailsService {
	@Autowired
	FlightDetailsDAO dao;

	public FlightDetails1 addFlightDetails(FlightDetails1 flightdetails) {
		FlightDetails1 e = dao.save(flightdetails);
		return e;
	}

	@Override
	public List<FlightDetails1> findAllflightdetails() {
		List<FlightDetails1> e = dao.findAll();
		return e;
	}

	@Override
	public Optional<FlightDetails1> findByfromcity(String fromcity) {
		Optional<FlightDetails1> a = dao.findByfromcity(fromcity);
		return a;
	}

	@Override

	public Optional<FlightDetails1> findBytocity(String tocity) {
		Optional<FlightDetails1> a = dao.findBytocity(tocity);
		return a;
	}

	@Override
	public List<FlightDetails1> findByflightnumber(int flightnumber) {
		List<FlightDetails1> a = dao.findByflightnumber(flightnumber);
		return a;

	}

	@Override
	public Optional<FlightDetails1> findBydate(java.util.Date date) {
		Optional<FlightDetails1> a = dao.findBydate(date);
		return a;

	}

	@Override
	public List<FlightDetails1> findByarrivaltime(Time arrivaltime) {
		List<FlightDetails1> a = dao.findByarrivaltime(arrivaltime);
		return a;

	}

	@Override
	public List<FlightDetails1> findBydeparturetime(Time departuretime) {
		List<FlightDetails1> a = dao.findBydeparturetime(departuretime);
		return a;

	}

	@Override
	public List<FlightDetails1> findByflighttype(String flighttype) {
		List<FlightDetails1> a = dao.findByflighttype(flighttype);
		return a;
	}

	@Override
	public List<FlightDetails1> findByseattype(String seattype) {
		List<FlightDetails1> a = dao.findByseattype(seattype);
		return a;
	}

	@Override
	public Optional<FlightDetails1> findByflightname(String flightname) {
		Optional<FlightDetails1> a = dao.findByflightname(flightname);
		return a;
	}

	@Override
	public List<FlightDetails1> findByairportname(String airportname) {
		List<FlightDetails1> a = dao.findByairportname(airportname);
		return a;

	}

	@Override
	public FlightDetails1 updateFlightDetails1(FlightDetails1 flightdetails) {
		FlightDetails1 e = dao.save(flightdetails);
		return e;
	}

	@Override
	public FlightDetails1 save(Optional<FlightDetails1> flightdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<FlightDetails1> delete(int flightnumber) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
