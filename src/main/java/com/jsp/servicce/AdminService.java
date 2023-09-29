package com.jsp.servicce;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dto.Admin;
import com.jsp.dto.Librarian;

public class AdminService {
	Admin admin =new Admin();
	AdminDao adminDao = new AdminDao();
	LibrarianDao librarianDao=new LibrarianDao();
	
	//
	public void validateAdmin(int id ,String username, String password) {
		Admin a = adminDao.getAdmin(id);
		if(a==null)
		{
			System.out.println("Admin Cannot be Null");
		}
		if(a.getUsename().equals(username) &&a.getPass().equals(password))
		{
			System.out.println("Login Succefully");
			
		}
		else
		{
			System.out.println("Sorry!!, incorrect username or passward ");
		}
		
		
	}
	public Admin saveAdmin(Admin admin)
	{
		return adminDao.saveAdmin(admin);
	}
	
	public Admin deleteAdmin(int id)
	{
		return adminDao.deleteAdmin(id);
	}
	
	public Admin updateAdminPass(int id, String password ) 
	{
		return adminDao.updateAdminPass(id,  password);
	}
	
	public Admin updateAdminUsername(int id, String username ) 
	{
		return adminDao.updateAdminUsername(id, username);
	}
	
	public Admin getAdmin(int id)
	{
		return adminDao.getAdmin(id);
	}
	
	public List<Admin> getAllAdmin()
	
	{
		return adminDao.getAllAdmin();
	}
	public List<Librarian> viewAllUnAuthorised() {
        List<Librarian> allLibrarians = librarianDao.getAllLibrarian();
        List<Librarian> unAuthorisedLibrarians = new ArrayList<>();

        for (Librarian librarian : allLibrarians) {
            if ("UnAuthorized".equals(librarian.getStatus())) {
                unAuthorisedLibrarians.add(librarian);
                System.out.println("ID: " + librarian.getId());
                System.out.println("Email: " + librarian.getEmail());
                System.out.println("Name: " + librarian.getName());
                System.out.println("Status: " + librarian.getStatus());
            }
        }

        return allLibrarians; 
    } 
	
	public boolean approveLibrarianById(int libid, int adminid) {
	    Admin admin = adminDao.getAdmin(adminid);
	    if (admin == null) {
	        return false; 
	    }
	    Librarian librarian = librarianDao.getLibrarian(libid);
	    if (librarian == null ) {
	        return false; 
	    }
	    if(librarian.getStatus().equals("Authorized"))
	    {
	    	System.out.println("Its Already Authorized");
	    }
	    else
	    {
	    librarian.setAdmin(admin);
	    librarian.setStatus("Authorized");
	    librarianDao.approve(librarian);
	    
	    }
	    return true; 
	}
	
	public boolean rejectLibrarianById(int libid, int adminid) {
	    Admin admin = adminDao.getAdmin(adminid);
	    if (admin == null) {
	        return false; 
	    }
	    Librarian librarian = librarianDao.getLibrarian(libid);
	    if (librarian == null) {
	        return false; 
	    }
	    if (librarian.getStatus().equals("Authorized")) {
	        return false; 
	    }
	    librarian.setAdmin(admin);
	    librarian.setStatus("Reject");
	    librarianDao.approve(librarian);

	    return true; 
	}
}
