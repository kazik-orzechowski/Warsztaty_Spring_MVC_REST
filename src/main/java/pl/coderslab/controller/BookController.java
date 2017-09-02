package pl.coderslab.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.Book;
import pl.coderslab.BookService;
import pl.coderslab.MemoryBookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService memoryBookService;
	//	MemoryBookService memoryBookService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "{hello:	World}";
	}
	
	@RequestMapping("/helloBook")
	public Book helloBook(){
		return new Book (1,"9788324631766", "Java", 
				"Bruce Eckelman", "Helion", "Poetry");
}
	
	@GetMapping("/bookList")
	public List<Book> listBook(){
		return memoryBookService.getList();
}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable long id){
		return memoryBookService.getBookById(id);
}
	
	@RequestMapping("/delBook/{title}")
	public Book delBook(@PathVariable String title){
		return memoryBookService.delBook(title);
}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestParam long id, @RequestParam String isbn, @RequestParam String title, 
						@RequestParam String author, @RequestParam String publisher,
						@RequestParam String type) {
		
		Book newBook = new Book (id, isbn, title, author, publisher, type);
		memoryBookService.addBook(newBook);
		
		return newBook;
}
	
	
	
	@PostMapping("/updateBook2")
	public Book updateBookPost(@RequestParam long id, @RequestParam String isbn, @RequestParam String title, 
						@RequestParam String author, @RequestParam String publisher,
						@RequestParam String type) {
		
		Book newBook = new Book (id, isbn, title, author, publisher, type);
		memoryBookService.updateBook(newBook);
		
		return newBook;
}
	
}
