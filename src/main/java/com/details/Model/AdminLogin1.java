package com.details.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminlog")
public class AdminLogin1 {
	@Id
	private String username="Admin123";
	private String password="guest123";
	




	public AdminLogin1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AdminLogin1(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public static void main (String args[]){
		AdminLogin1 a = new AdminLogin1();
		if ((a.getUsername().equals("Admin123")) && (a.getPassword().equals("guest123"))) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}
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
}

