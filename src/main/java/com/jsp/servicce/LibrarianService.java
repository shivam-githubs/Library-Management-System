package com.jsp.servicce;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dao.StudentDao;
import com.jsp.dto.Book;
import com.jsp.dto.Librarian;
import com.jsp.dto.Student;

public class LibrarianService {
	LibrarianDao librarianDao =new LibrarianDao();
	BookDao bookDao = new BookDao();
	StudentDao studentDao =new StudentDao();
	public Librarian saveLibrarian(Librarian librarian)
	{
		librarian.setStatus("UnAuthorized");
		return librarianDao.saveLibrarian(librarian);
	}
	
	public Librarian deleteLibrarian(int id)
	{
		return librarianDao.deleteLibrarian(id);
	}
	
	public Librarian updateLibrarian(int id, String email ) 
	{
		return librarianDao.updateLibrarian(id, email );
	}

	public Librarian getLibrarian(int id)
	{
		return librarianDao.getLibrarian(id);
	}
	
	public List<Librarian> getAllLibrarian() {
        List<Librarian> librarians = librarianDao.getAllLibrarian();

        for (Librarian librarian : librarians) {
            System.out.println("ID: " + librarian.getId());
            System.out.println("Email: " + librarian.getEmail());
            System.out.println("Name: " + librarian.getName());
            System.out.println("Status: " + librarian.getStatus());
        }

        return librarians;
    }
	
	
	
	public Boolean addBook(Book book) 
	{
		BookDao bookDao = new BookDao();
		bookDao.saveBook(book);
		return true;
	}

	public Boolean removeBookById(int bookid) {
		BookDao bookDao = new BookDao();
		bookDao.deleteBook(bookid);
		return true;
	}
	
	public boolean issueBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBook(bookid);
		Student student = studentDao.getStudent(studid);
		Librarian librarian = librarianDao.getLibrarian(libid);
		if (librarian.getStatus().equals("Authorized"))
		{
			if(book.getStatus().equals("Issued"))
			{
				book.setStatus("UnAvailable");
			}
			else if (librarian != null && book != null && student != null) {
				book.setStatus("Issued");
				book.setStudent(student);
				book.setLibrarian(librarian);
			}
			
		}
		else
		{
			return false;
		}
		
		return bookDao.issue(book);

	}

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBook(bookid);
		if (book != null && book.getStatus().equals("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return false;
	}
}
	



