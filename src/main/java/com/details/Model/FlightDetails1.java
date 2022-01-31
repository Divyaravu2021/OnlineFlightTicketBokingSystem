package com.details.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "flightdetails23")
public class FlightDetails1 {
	@Id
	private int flightnumber;
	

	private String flightname;
	
	@Column(name="fromcity",nullable=false)
	@NotEmpty
	@Size(min=2,message="fromcity must have atleast 3 characters")
	private String fromcity;
	
	private String tocity;

	private Date date;
	private Time arrivaltime;
	private Time departuretime;

	private String airportname;
	private String flighttype;
	private String seattype;
	

	public FlightDetails1(int i, String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9) {
		// TODO Auto-generated constructor stub
	}

	public FlightDetails1(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public FlightDetails1(int i) {
		// TODO Auto-generated constructor stub
	}

	public FlightDetails1(String string) {
		// TODO Auto-generated constructor stub
	}
	

public FlightDetails1(int flightnumber, String flightname,
			@NotEmpty @Size(min = 2, message = "fromcity must have atleast 3 characters") String fromcity,
			String tocity, Date date, Time arrivaltime, Time departuretime, String airportname, String flighttype,
			String seattype) {
		super();
		this.flightnumber = flightnumber;
		this.flightname = flightname;
		this.fromcity = fromcity;
		this.tocity = tocity;
		this.date = date;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
		this.airportname = airportname;
		this.flighttype = flighttype;
		this.seattype = seattype;
	}


	public FlightDetails1() {
	super();
	// TODO Auto-generated constructor stub
}

	public int getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	


	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getFromcity() {
		return fromcity;
	}

	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(Time arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public Time getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(Time departuretime) {
		this.departuretime = departuretime;
	}

	public String getFlighttype() {
		return flighttype;
	}

	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getAirportname() {
		return airportname;
	}

	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}

	@Override
	public String toString() {
		return "FlightDetails1 [flightnumber=" + flightnumber + ", flightname=" + flightname + ", fromcity=" + fromcity
				+ ", tocity=" + tocity + ", date=" + date + ", arrivaltime=" + arrivaltime + ", departuretime="
				+ departuretime + ", airportname=" + airportname + ", flighttype=" + flighttype + ", seattype="
				+ seattype + "]";
	}


}