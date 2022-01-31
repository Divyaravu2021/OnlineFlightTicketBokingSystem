package com.details.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.Model.AdminLogin1;
import com.details.Service.AdminLoginService1;



@RestController
public class AdminLogin1RestController {
	@Autowired
	AdminLoginService1  service;
	
	@GetMapping("/adminlog")
	public ResponseEntity<List <AdminLogin1>> fetchDetails(){
		
		List<AdminLogin1> e=service.findAll();
		return ResponseEntity.ok().body(e);
	}
}
	
	
	
	
	
