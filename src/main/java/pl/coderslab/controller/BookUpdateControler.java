package pl.coderslab.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.coderslab.Book;
import pl.coderslab.MemoryBookService;

@Controller

public class BookUpdateControler {

	@Autowired
	MemoryBookService memoryBookService;
	
	
	@GetMapping("/updateBook/{id}")
	public String updateBook(@PathVariable long id, Model model, HttpServletResponse response) throws IOException {
		
		Book bookToUpdate = memoryBookService.getBookById(id);
		model.addAttribute("bookToUpdate", bookToUpdate);
						
		return "updateBook";
}
	
}
