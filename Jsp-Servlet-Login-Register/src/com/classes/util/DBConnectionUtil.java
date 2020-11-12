package com.classes.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {

	//define the database property
	public static final String URL="jdbc:mysql://localhost:3306/saurabh";
	
	public static final String DRIVER="com.mysql.jdbc.Driver";
	
	public static final String USERNAME="root";
	
	public static final String PASSWORD="";
	
	public static Connection connection=null;
	
	//define static method
	public static Connection openConnection()
	{
		
		//check the connection
		if(connection !=null) {
		return connection;
		}else {
			try {
				//load the driver
				Class.forName(DRIVER);
				
				//GET THE CONNECTION 
				connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return connection;
	}
}
