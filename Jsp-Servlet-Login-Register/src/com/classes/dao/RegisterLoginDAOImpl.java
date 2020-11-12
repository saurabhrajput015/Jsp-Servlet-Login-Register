package com.classes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.classes.modal.Register;
import com.classes.util.DBConnectionUtil;


public class RegisterLoginDAOImpl implements RegisterLoginDAO {

	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	public boolean save(Register r) {
		boolean flag=false;
		try
		{
			String sql="INSERT INTO register_employee(name,email,password)VALUES('"+r.getName()+"','"+r.getEmail()+"','"+r.getPassword()+"')";
			connection=DBConnectionUtil.openConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag=true;
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return flag;
	}

}
