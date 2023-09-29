package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	
	
	//saveStudent
	public Student saveStudent(Student student)
	{
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	//to delete
		public Student deleteStudent(int id)
		{
			Student student =entityManager.find(Student.class, id);
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return student;
		}
		
		public Student updateStudent(int id, String email, String name ) {
			
			Student student = entityManager.find(Student.class, id);
			student.setEmail(email);
			student.setName(name);
			
			if(student!=null) {
				entityTransaction.begin();
				entityManager.merge(student);
				entityTransaction.commit();
				
			}
			
			return student;
			
		}
		
		public Student getStudent(int id)
		{
			Student student= entityManager.find(Student.class, id);
			System.out.println(student.getId());
			System.out.println(student.getEmail());
			System.out.println(student.getName());
			
			return student;
		}
		
		public boolean  approve(Student student) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return true;
		}
		
		public List<Student> getAllStudent()
		{
			String sql = "SELECT e FROM Student e";
			Query query= entityManager.createQuery(sql);
			List <Student> students = query.getResultList();
			for(Student student : students)
			{
				System.out.println(student.getId());
				System.out.println(student.getEmail());
				System.out.println(student.getName());
			}return query.getResultList();
		}
}
