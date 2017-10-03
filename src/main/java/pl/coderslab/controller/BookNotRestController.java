package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.coderslab.Book;
import pl.coderslab.BookService;

@Controller 
public class BookNotRestController {

	
	@Autowired
	BookService memoryBookService;

	@GetMapping("/addBook")
	public String addBook() {

		return "updateBook";
	}
	
	@GetMapping("/updateBook/{id}")
	public String updateBook(@PathVariable long id, Model model) {

		Book bookToUpdate = memoryBookService.getBookById(id);
		model.addAttribute("bookToUpdate", bookToUpdate);

		return "updateBook";
	}

	
}
