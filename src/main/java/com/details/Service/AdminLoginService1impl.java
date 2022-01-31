package com.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.AdminLogin1;
import com.details.Repository.AdminLogin1DAO;




@Service
public class AdminLoginService1impl implements AdminLoginService1 {
	@Autowired
	AdminLogin1DAO dao;	
	public AdminLogin1 addAdminLogin1(AdminLogin1 AdminLogin1) 
	{
		AdminLogin1 emp=dao.save(AdminLogin1);
		return emp;
	}
	@Override
	public Optional<AdminLogin1> findByusername(String username) {
		Optional<AdminLogin1>e=dao.findByusername(username);
		return e;
	}
	@Override
	public List<AdminLogin1> findAll() {
		List<AdminLogin1> e = dao.findAll();
		return e;
	}
	
}

