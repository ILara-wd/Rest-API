package com.warriorsdev.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warriorsdev.demo.model.Book;

public interface IBookRepo extends JpaRepository<Book, Integer> {
	
}