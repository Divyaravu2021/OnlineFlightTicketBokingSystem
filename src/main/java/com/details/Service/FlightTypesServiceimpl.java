package com.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.FlightDetails1;
import com.details.Model.FlightTypes;
import com.details.Repository.FlightTypesDAO;
@Service
public class FlightTypesServiceimpl implements FlightTypesService {
	
	@Autowired
	FlightTypesDAO dao;
	public FlightTypes addFlightTypes(FlightTypes flighttypes) {
		FlightTypes e = dao.save(flighttypes);
		return e;
	}

	@Override
	public List<FlightTypes> findAll() {
		List<FlightTypes> e = dao.findAll();
		return e;
	}

	@Override
	public List<FlightTypes> findByaircraft(String aircraft) {
		List<FlightTypes> a = dao.findByaircraft(aircraft);
		return a;
		
		
	}

	@Override
	public List<FlightTypes> findBynoofseats(int noofseats) {
		List<FlightTypes> a = dao.findBynoofseats(noofseats);
		return a;
	}

}
