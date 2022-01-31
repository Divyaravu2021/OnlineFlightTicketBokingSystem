package com.details.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.FlightTypes;

public interface FlightTypesDAO extends JpaRepository<FlightTypes, Integer> {
	
	
	List<FlightTypes> findAll();

	List<FlightTypes> findByaircraft(String aircraft);

	List<FlightTypes> findBynoofseats(int noofseats);

	FlightTypes save(FlightTypes flighttypes);
}
