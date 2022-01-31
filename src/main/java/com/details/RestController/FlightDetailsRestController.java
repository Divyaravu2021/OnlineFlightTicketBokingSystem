package com.details.RestController;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.Excpetion.RecordNotFoundException;
import com.details.Model.FlightDetails1;
import com.details.Service.FlightDetailsService;



@RestController


public class FlightDetailsRestController {
	@Autowired
	FlightDetailsService  service;
	@PostMapping("/flightdetails23")
	public ResponseEntity<FlightDetails1> createDetails(@Validated @RequestBody FlightDetails1 flightdetails){
		
		System.out.println("Rest");
		FlightDetails1 e= service.addFlightDetails(flightdetails);
		System.out.println(e);
		return new ResponseEntity<FlightDetails1>(e,HttpStatus.OK);
	}
	
	

	@GetMapping("/flightdetails23")
	public ResponseEntity<List <FlightDetails1>> fetchDetails(){
		//System.out.println("alll");
		List<FlightDetails1> e=service.findAllflightdetails();
		return ResponseEntity.ok().body(e);
	}
	
	@GetMapping("/flightdetails23/{flightname}")
	public ResponseEntity<FlightDetails1> getFlightDetailsByflightname(@PathVariable("flightname") String flightname){
		Optional<FlightDetails1> e=service.findByflightname(flightname);
		
		if(e.isPresent()) {
			System.out.println("alll");
			return new ResponseEntity<>(e.get(),HttpStatus.OK);
		
		}
		else {
			throw new RecordNotFoundException("Record not found...");
		}
		
	
	}
	
/*	@GetMapping("/flightdetails23/{fromcity}")
	public ResponseEntity<FlightDetails1> getFlightDetailsByfromcity(@PathVariable("fromcity") String fromcity){
		Optional<FlightDetails1> e=service.findByfromcity(fromcity);
		
		if(e.isPresent()) {
			System.out.println("alll");
			return new ResponseEntity<>(e.get(),HttpStatus.OK);
		
		}
		else {
			throw new RecordNotFoundException("Record not found...");
		}
		
	
	}*/
	/*@GetMapping("/flightdetails23/{tocity}")
	public ResponseEntity<FlightDetails1> getFlightDetailsBytocity(@PathVariable("tocity") String tocity){
		Optional<FlightDetails1> e=service.findBytocity(tocity);
		
		if(e.isPresent()) {
			System.out.println("alll");
			return new ResponseEntity<>(e.get(),HttpStatus.OK);
		
		}
		else {
			throw new RecordNotFoundException("Record not found...");
		}
		
	
	}*/
/*	@GetMapping("/flightdetails23/{date}")
	public ResponseEntity<FlightDetails1> getFlightDetailsBydate(@PathVariable("date") Date date){
		Optional<FlightDetails1> e=service.findBydate(date);
		
		if(e.isPresent()) {
			System.out.println("alll");
			return new ResponseEntity<>(e.get(),HttpStatus.OK);
		
		}
		else {
			throw new RecordNotFoundException("Record not found...");
		}
		
	
	}*/
	
	@PutMapping("/flightdetails23/{flightname}")
	public ResponseEntity<FlightDetails1> updateFlightDetails1(@PathVariable String name,@RequestBody FlightDetails1 flightdetails)
	{
		
		FlightDetails1  p = service.updateFlightDetails1(flightdetails);
		System.out.println("hi hello");
		return new ResponseEntity<FlightDetails1>(p,HttpStatus.OK);
	}
	
	
//	@PutMapping("/flightdetails23/{flightname}")
//	public ResponseEntity<FlightDetails1> updateFlightDetails(@PathVariable( "flightname") String flightname,
//	  @Valid @RequestBody FlightDetails1 FlighteDetails) {
//	     Optional<FlightDetails1> flightdetails = service.findByflightname(flightname);
//	    
//
//	     flightdetails.setflightname(FlightDetails1.getFlightname());
////	     employee.setLastName(employeeDetails.getLastName());
////	     employee.setFirstName(employeeDetails.getFirstName());
//	     final FlightDetails1 updateddetails = service.save(flightdetails);
//	     return ResponseEntity.ok(updateddetails);
//	}
	@DeleteMapping(value = "flightdetails23/{flightnumber}")
    public ResponseEntity<Optional<FlightDetails1>> deletedetails(@PathVariable int flightnumber) {

        Optional<FlightDetails1> e =service.delete(flightnumber);
      
        return ResponseEntity.ok().body(e);
	}
}    

	




