package pl.coderslab;

import java.util.List;

public interface BookService {

	public Book getBook (String title);
	
	public Book delBook (String title);
	
	public List<Book> getList();
	
	public	void	setList(List<Book>	list);
	
	public Book addBook(Book book);

	public Book updateBook(Book newBook) ;
	
	public Book getBookById(long id) ;
	
	

}
