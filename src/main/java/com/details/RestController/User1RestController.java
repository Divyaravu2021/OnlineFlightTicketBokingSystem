package com.details.RestController;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.User1;
import com.details.Service.User1Service;



@RestController

public class User1RestController {
	@Autowired
	User1Service Service;

	@PostMapping("/userlogin")
	public ResponseEntity<User1> createProduct(@Validated @RequestBody User1 Reg)
	{
		System.out.println("Rest");
		User1 e= Service.addUser1(Reg);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<User1>(e,HttpStatus.OK);
	}
	
	@GetMapping("/userlogin")
	public ResponseEntity<String> getByUsernameandPassword( @RequestBody User1 user)
	{
		User1 us=Service.login(user.getUsername(), user.getPassword());
	
	if(Objects.nonNull(us))
	{
		System.out.println("hi");
		return ResponseEntity.ok().body("Login successfully");
	}
	else
	{
		return ResponseEntity.ok().body("Incorrect username or password");
		
	}
	}
}
		
	


		
		
		
		
		
		


	
