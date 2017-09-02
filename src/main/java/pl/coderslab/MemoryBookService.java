package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MemoryBookService implements BookService {

	List<Book> bookList;
		
	public	MemoryBookService() {
		bookList = new ArrayList<Book>();
		bookList.add(new Book(1L,"9788324631766", "Thiniking in Java", 
				"Bruce Eckelman", "Helion", "programming"));
		bookList.add(new Book(2L,"9780130819338", "Java 2. Podstawy", 
				"Cay Horstmann, Gary Cornell,", "Helion", "programming"));
		bookList.add(new Book(3L,"9788324627738", "Rusz Glowa z Java", 
				"Sierra Kathy, Bates Bert", "Helion", "programming"));
			
	}
	
	public Book getBook (String title) {
		for(Book book : bookList) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	
	
	public Book delBook (String title) {
		for(Book book : bookList) {
			if (book.getTitle().equals(title)) {
				bookList.remove(book);
				return book;
			}
		}
		return null;
	}
	
	
	public List<Book> getList() {
		return bookList;
	}
	
	public	void	setList(List<Book>	list)	{
		this.bookList	=	list;
	}
	
	public Book addBook(Book book) {
		bookList.add(book);
			
		return book;
	}

	public Book updateBook(Book newBook) {
		for(Book book : bookList) {
			if (book.getId()==(newBook.getId())) {
				bookList.remove(book);
				bookList.add(newBook);
				return newBook;
			}
		}
			return null;
		
	}

	public Book getBookById(long id) {
		for(Book book : bookList) {
			if (book.getId()==(id)) {
				return book;
			}
		}
		return null;
	}
	
	
}
