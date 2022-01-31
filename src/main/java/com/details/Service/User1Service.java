package com.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.details.Model.User1;

@Service
public interface User1Service {

	User1 addUser1(User1 user1);

	List<User1> findAll();

	User1 login(Object username, Object password);

	//List<User1> findByUsernameAndPassword(String string, String password);

}
