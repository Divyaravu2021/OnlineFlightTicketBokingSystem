package com.details.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.FlightTypes;
import com.details.Service.FlightTypesService;

@RestController
public class FlightTypesRestController {
	
	@Autowired
	FlightTypesService  service;
	@PostMapping("/flighttypes")
	public ResponseEntity<FlightTypes> createDetails(@Validated @RequestBody FlightTypes fligttypes){
		
		System.out.println("Rest");
		FlightTypes e= service.addFlightTypes(fligttypes);
		System.out.println(e);
		return new ResponseEntity<FlightTypes>(e,HttpStatus.OK);
	}
	@GetMapping("/flighttypes")
	public ResponseEntity<List <FlightTypes>> fetchDetails(){
		//System.out.println("alll");
		List<FlightTypes> e=service.findAll();
		return ResponseEntity.ok().body(e);
	}
	

}
