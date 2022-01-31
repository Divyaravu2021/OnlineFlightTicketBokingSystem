package com.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.User1;
import com.details.Repository.User1DAO;

@Service
public class User1Serviceimpl implements User1Service {

	@Autowired
	User1DAO dao;
	public User1 addUser1(User1 user1) {
		User1 registration = dao.save(user1);
		return user1;
	}

	@Override
	public List<User1> findAll() {
		List<User1> e = dao.findAll();
		return e;
	}

	@Override
	public User1 login(Object getuserName, Object password) {
		User1 login=dao.findByUsernameAndPassword(getuserName,password);
		return login;
	}
	
	
	//@Autowired
		//UserRepository repo1;
		public User1 user(String username,String password) {
			User1 login = dao.findByUsernameAndPassword(username, password);
			return login;
		}
		
		

}
