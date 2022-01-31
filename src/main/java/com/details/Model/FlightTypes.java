package com.details.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flighttypes")
public class FlightTypes {
	@Id
	private String aircraft;
	private int noofseats;

	
	public String getAircraft() {
		return aircraft;
	}
	public FlightTypes(String aircraft, int noofseats) {
	super();
	this.aircraft = aircraft;
	this.noofseats = noofseats;
}
	
	public FlightTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	@Override
	public String toString() {
		return "FlightTypes [aircraft=" + aircraft + ", noofseats=" + noofseats + "]";
	}
	public List<FlightTypes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
