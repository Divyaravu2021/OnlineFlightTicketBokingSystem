package com.details;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.details.Model.User1;
import com.details.Repository.User1DAO;
import com.details.Service.User1Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserLoginAndRegistration {

	@Autowired
	private User1Service Service;

	@MockBean
	private User1DAO repository;
	
	@Test
	public void getUser1AndTest() {
		when(repository.findAll()).thenReturn(
				Stream.of(new User1()).collect(Collectors.toList()));
				
				assertEquals(1,Service.findAll().size());
	}
	

}
