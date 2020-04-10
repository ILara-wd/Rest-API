package com.warriorsdev.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.warriorsdev.demo.model.Book;
import com.warriorsdev.demo.repo.IBookRepo;


@RestController
@RequestMapping("/book")
public class DemoRestController {

	@Autowired
	private IBookRepo repo;
	
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return repo.save(book);
	}

	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return repo.save(book);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteBook(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
	@GetMapping(value = "/{id}")
	public Book findById(@PathVariable("id") Integer id) {
		Optional<Book> result = repo.findById(id);
		return result.get();
	}
	
	@GetMapping
	public List<Book> getBooks() {
		return repo.findAll();
	}
	
}