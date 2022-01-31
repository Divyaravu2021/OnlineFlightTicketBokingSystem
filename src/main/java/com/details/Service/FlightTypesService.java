package com.details.Service;

import java.util.List;

import com.details.Model.FlightTypes;

public interface FlightTypesService {
	
	FlightTypes addFlightTypes(FlightTypes flighttypes);
	
	List<FlightTypes> findByaircraft(String aircraft);

	List<FlightTypes> findBynoofseats(int noofseats);

	List<FlightTypes> findAll();

}
