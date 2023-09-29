package com.jsp.servicce;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.Book;
import com.jsp.dto.Librarian;

public class BookService {
	BookDao bookDao =new BookDao();
	public Book saveBook(Book book)
	{
		return bookDao.saveBook(book);
	}
	
	public Book deleteBook(int id)
	{
		return bookDao.deleteBook(id);
	}
	
	public Book updateStudent(int id,  String name,String status ) 
	{
		return bookDao.updateBook(id, name,status);
	}
	
	public Book getBook(int id)
	{
		return bookDao.getBook(id);
	}
	
	public List<Book> getAllBook()
	
	{
		return bookDao.getAllBook();
	}
}
