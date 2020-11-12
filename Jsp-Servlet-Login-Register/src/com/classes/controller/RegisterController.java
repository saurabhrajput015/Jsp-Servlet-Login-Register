package com.classes.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classes.dao.RegisterLoginDAO;
import com.classes.dao.RegisterLoginDAOImpl;
import com.classes.modal.Register;


public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	RequestDispatcher dispatcher=null;
	//create a reference 
	RegisterLoginDAO RegisterLoginDAO=null;
	
	public RegisterController() {
		RegisterLoginDAO =new RegisterLoginDAOImpl();
	}
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Register r=new Register();
		r.setName(name);
		r.setEmail(email);
		r.setPassword(password);
		RegisterLoginDAO.save(r);
		request.setAttribute("message","Saved Successfully.....");
		
		dispatcher =request.getRequestDispatcher("/view/login.jsp");
		
	}

}
