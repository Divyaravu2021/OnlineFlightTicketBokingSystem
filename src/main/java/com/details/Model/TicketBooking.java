package com.details.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class TicketBooking 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username="user";
	private int flightnumer;
	private String flightname;
	private String fromcity;
	private String tocity;
	private Date date;
	private int price;
	
	
	public TicketBooking(int i, String string, String string2, String string3, String string4, int j, int k,
			String string5) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getId() 
	{
		return id;
	}
	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketBooking(int id, String username, int flightnumer, String flightname, String fromcity, String tocity,
		Date date, int price) {
	super();
	this.id = id;
	this.username = username;
	this.flightnumer = flightnumer;
	this.flightname = flightname;
	this.fromcity = fromcity;
	this.tocity = tocity;
	this.date = date;
	this.price = price;
}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public int getFlightnumer() 
	{
		return flightnumer;
	}
	public void setFlightnumer(int flightnumer)
	{
		this.flightnumer = flightnumer;
	}
	public String getFlightname()
	{
		return flightname;
	}
	public void setFlightname(String flightname) 
	{
		this.flightname = flightname;
	}
	public String getFromcity() 
	{
		return fromcity;
	}
	public void setFromcity(String fromcity)
	{
		this.fromcity = fromcity;
	}
	public String getTocity() 
	{
		return tocity;
	}
	public void setTocity(String tocity) 
	{
		this.tocity = tocity;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Booking [id=" + id + ", username=" + username + ", flightnumer=" + flightnumer + ", flightname="
				+ flightname + ", fromcity=" + fromcity + ", tocity=" + tocity + ", date=" + date + ", price=" + price
				+ "]";
	}
	
	

}