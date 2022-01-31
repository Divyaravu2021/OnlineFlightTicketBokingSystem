package com.details.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.AdminLogin1;



public interface AdminLogin1DAO extends JpaRepository<AdminLogin1,Integer> {

	

	Optional<AdminLogin1> findByusername(String username);

}
