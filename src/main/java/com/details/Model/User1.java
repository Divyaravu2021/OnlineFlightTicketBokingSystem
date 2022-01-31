package com.details.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class User1 {
	@Id
	private int id;
	private String username;
	private String password;
	private String contact_no;
	private String address;
	private String Email_id;

	
	public int getId() {
		return id;
	}
	public User1(int id, String username, String password, String contact_no, String address, String email_id) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.contact_no = contact_no;
	this.address = address;
	Email_id = email_id;
}
	
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", username=" + username + ", password=" + password + ", contact_no=" + contact_no
				+ ", address=" + address + ", Email_id=" + Email_id + "]";
	}
	
	

}







