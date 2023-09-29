package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;


public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	
	//saveAdmin
	public Admin saveAdmin(Admin admin)
	{
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}
	
	//to delete
		public Admin deleteAdmin(int id)
		{
			Admin admin =entityManager.find(Admin.class, id);
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
			return admin;
		}
		
		public Admin updateAdminUsername(int id, String username ) {
			
			Admin admin1 = entityManager.find(Admin.class, id);
			admin1.setUsename(username);
			if(admin1!=null) {
				entityTransaction.begin();
				entityManager.merge(admin1);
				entityTransaction.commit();
			}
			
			return admin1;
			
		}
		
          public Admin updateAdminPass(int id, String password ) {
			
			Admin admin1 = entityManager.find(Admin.class, id);
			admin1.setPass(password);
			if(admin1!=null) {
				entityTransaction.begin();
				entityManager.merge(admin1);
				entityTransaction.commit();
			}
			
			return admin1;
			
		}
		
		public Admin getAdmin(int id)
		{
			Admin employee= entityManager.find(Admin.class, id);
			System.out.println(employee.getId());
			System.out.println(employee.getUsename());
			System.out.println(employee.getPass());
			return employee;
		}
		
		public List<Admin> getAllAdmin()
		{
			String sql = "SELECT e FROM Admin e";
			Query query= entityManager.createQuery(sql);
			List <Admin> admin = query.getResultList();
			for(Admin f : admin)
			{
				System.out.println("===================");
				System.out.println(f.getId());
				System.out.println(f.getUsename());
				System.out.println(f.getPass());
				
			}return query.getResultList();
		}
		
	
	
	
	
	
}
