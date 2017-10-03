package pl.coderslab.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.Book;
import pl.coderslab.BookService;

/**
 * Rest controller responsible for all library operations
 * 
 * @author kaz
 *
 */

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService memoryBookService;

	@RequestMapping("/hello")
	public String hello() {
		return "{hello:	World}";
	}

	@RequestMapping("/helloBook")
	public Book helloBook() {
		return new Book(1, "9788324631766", "Java", "Bruce Eckelman", "Helion", "Poetry");
	}

	@GetMapping("/bookList")
	public List<Book> listBook() {
		return memoryBookService.getList();
	}

	@GetMapping("/{id}")
	public Book getBookById(@PathVariable long id) {
		return memoryBookService.getBookById(id);
	}

	@RequestMapping("/delBook/{title}")
	public Book delBook(@PathVariable String title) {
		return memoryBookService.delBook(title);
	}

	@PostMapping("/addBook")
	public Book addBook(@RequestParam long id, @RequestParam String isbn, @RequestParam String title,
			@RequestParam String author, @RequestParam String publisher, @RequestParam String type) {

		Book newBook = new Book(id, isbn, title, author, publisher, type);
		memoryBookService.addBook(newBook);

		return newBook;
	}

	@GetMapping("/updateBook/{id}")
	public String updateBook(@PathVariable long id, Model model) {

		Book bookToUpdate = memoryBookService.getBookById(id);
		model.addAttribute("bookToUpdate", bookToUpdate);

		return "redirect: /updateBook";
	}

	@PostMapping("/updateBookPost")
	public Book updateBookPost(@RequestParam long id, @RequestParam String isbn, @RequestParam String title,
			@RequestParam String author, @RequestParam String publisher, @RequestParam String type) {

		Book newBook = new Book(id, isbn, title, author, publisher, type);
		memoryBookService.updateBook(newBook);

		return newBook;
	}

}
