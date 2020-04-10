package com.warriorsdev.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.warriorsdev.demo.model.User;
import com.warriorsdev.demo.repo.IUserRepo;

@SpringBootTest
class ApiRestEcommerceApplicationTests {

	@Autowired
	private IUserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void CreateUser() {
		User entity = new User();
		entity.setName("lara");
		entity.setPassword(encoder.encode("321"));
		User retorn = repo.save(entity);
		assertTrue(retorn.getPassword().equals(encoder.encode(entity.getPassword())));
	}

}
