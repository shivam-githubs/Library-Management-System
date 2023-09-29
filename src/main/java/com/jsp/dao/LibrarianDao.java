package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Librarian;


public class LibrarianDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	
	//saveLibrarian
	public Librarian saveLibrarian(Librarian librarian)
	{
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}
	
	//to delete
		public Librarian deleteLibrarian(int id)
		{
			Librarian Librarian =entityManager.find(Librarian.class, id);
			entityTransaction.begin();
			entityManager.remove(Librarian);
			entityTransaction.commit();
			return Librarian;
		}
		
		public Librarian updateLibrarian(int id, String email) {
			
			Librarian librarian1 = entityManager.find(Librarian.class, id);
			librarian1.setEmail(email);

			if(librarian1!=null) {
				entityTransaction.begin();
				entityManager.merge(librarian1);
				entityTransaction.commit();
				
			}
			
			return librarian1;
			
		}
		
		public Librarian getLibrarian(int id)
		{
			Librarian librarian= entityManager.find(Librarian.class, id);
			System.out.println(librarian.getId());
			System.out.println(librarian.getEmail());
			System.out.println(librarian.getName());
			System.out.println(librarian.getStatus());
			return librarian;
		}
		
		public boolean  approve(Librarian librarian ) {
			entityTransaction.begin();
			entityManager.merge(librarian);
			entityTransaction.commit();
			return true;
		}
		
		public List<Librarian> getAllLibrarian()
		{
			String sql = "SELECT e FROM Librarian e";
			Query query= entityManager.createQuery(sql);
			List <Librarian> librarian = query.getResultList();
			return query.getResultList();
		}
}
