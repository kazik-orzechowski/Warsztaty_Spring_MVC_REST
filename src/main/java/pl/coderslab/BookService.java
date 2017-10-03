package pl.coderslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * BookService interface defines all necessary methods regarding books to be
 * used in this application.
 * 
 * @author kaz
 *
 */

public interface BookService {

	public Book getBook(String title);

	public Book delBook(String title);

	public List<Book> getList();

	public void setList(List<Book> list);

	public Book addBook(Book book);

	public Book updateBook(Book newBook);

	public Book getBookById(long id);

}
