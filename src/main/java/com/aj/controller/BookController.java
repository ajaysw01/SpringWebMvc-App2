package com.aj.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aj.entity.Book;
import com.aj.repo.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo; // Inject BookRepository

	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if(findById.isPresent()) {
			Book bookObj = findById.get(); // Get the Book object from Optional
			//sending data to the view
			mav.addObject("book", bookObj);
		}
		//setting view page name
		mav.setViewName("index");
		return mav;
	}
}
