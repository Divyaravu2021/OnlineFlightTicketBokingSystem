package com.details;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.details.Model.AdminLogin1;
import com.details.Repository.AdminLogin1DAO;
import com.details.Service.AdminLoginService1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminLoginTest {
	@Autowired
	private AdminLoginService1 Service;
	
	@MockBean
	private AdminLogin1DAO repository;
	
	@Test
	public void getAdminLogin1AddTest() {

		when(repository.findAll())
				.thenReturn(Stream.of(new AdminLogin1("admin","guest@222")).collect(Collectors.toList()));

		assertEquals(1, Service.findAll().size());

	}

}
