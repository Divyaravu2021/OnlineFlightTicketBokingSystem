package com.details.Service;

import java.util.List;
import java.util.Optional;

import com.details.Model.AdminLogin1;



public interface AdminLoginService1 {
	public AdminLogin1 addAdminLogin1(AdminLogin1 adminlogin1);
	public Optional<AdminLogin1> findByusername(String username);
	public List<AdminLogin1> findAll();
	
}
