package com.classes.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username="root";
		String password="";
		String jdbcURL="jdbc:mysql://localhost:3306/saurabh";
		String driver="com.mysql.jdbc.Driver";
		
		try
		{
			//get the printwriter object
			PrintWriter pw=response.getWriter();
			pw.println("connecting to databse " +jdbcURL);
			//LOAD the Driver
			Class.forName(driver);
			//get the connection
			Connection connection=DriverManager.getConnection(jdbcURL,username,password);
			pw.println("Connection Successfully");
			//close the connection
			connection.close();
		
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
