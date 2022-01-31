package com.details.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.User1;

public interface User1DAO  extends JpaRepository<User1, Integer> {

	User1 save(User1 user1);

	

	List<User1> findAll();

	

	User1 findByUsernameAndPassword(Object getuserName, Object password);

	
}
