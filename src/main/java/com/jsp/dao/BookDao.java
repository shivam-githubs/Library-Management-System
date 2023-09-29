package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Book;
import com.jsp.dto.Librarian;

public class BookDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	
	//saveBook
	public Book saveBook(Book book)
	{
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}
	
	//to delete
		public Book deleteBook(int id)
		{
			Book book =entityManager.find(Book.class, id);
			entityTransaction.begin();
			entityManager.remove(book);
			entityTransaction.commit();
			return book;
		}
		
		public Book updateBook(int id, String book1, String status  ) {
			
			Book book = entityManager.find(Book.class, id);
			book.setBook(book1);
			book.setStatus(status);
			if(book!=null) {
				entityTransaction.begin();
				entityManager.merge(book);
				entityTransaction.commit();
				
			}
			
			return book;
			
		}
		
		public Book getBook(int id)
		{
			Book book= entityManager.find(Book.class, id);
			System.out.println(book.getId());
			System.out.println(book.getBook());
			System.out.println(book.getStatus());
			return book;
		}
		
		public boolean  approve(Book book) {
			entityTransaction.begin();
			entityManager.merge(book);
			entityTransaction.commit();
			return true;
		}
		
		public List<Book> getAllBook()
		{
			String sql = "SELECT e FROM Book e";
			Query query= entityManager.createQuery(sql);
			List <Book> books = query.getResultList();
			for(Book book : books)
			{
				System.out.println(book.getId());
				System.out.println(book.getBook());
				System.out.println(book.getStatus());
				
			}return query.getResultList();
		}
		
		public boolean issue(Book book) {
			entityTransaction.begin();
			entityManager.merge(book);
			entityTransaction.commit();
			return true;

		}

		public boolean returnBook(Book book) {
			entityTransaction.begin();
			entityManager.merge(book);
			entityTransaction.commit();
			return true;
		}
}


