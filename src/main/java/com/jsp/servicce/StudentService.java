package com.jsp.servicce;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao= new StudentDao();
	public Student saveStudent(Student librarian)
	{
	
		return studentDao.saveStudent(librarian);
	}
	
	public Student deleteStudent(int id)
	{
		return studentDao.deleteStudent(id);
	}
	
	public Student updateStudent(int id, String email, String name ) 
	{
		return studentDao.updateStudent(id, email, name);
	}
	
	public Student getStudent(int id)
	{
		return studentDao.getStudent(id);
	}
	
	public List<Student> getAllStudent()
	
	{
		return studentDao.getAllStudent();
	}
}
