package com.aj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
}