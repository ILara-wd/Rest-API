package com.warriorsdev.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warriorsdev.demo.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {
	
	User findByName(String name);
	
}