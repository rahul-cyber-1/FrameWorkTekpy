package com.comcast.crm.generic.DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class DatabaseUtility {
	Connection con = null;

	public void getDBConnection() {

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			DriverManager.getConnection("jdbc:mysql://localhost:3306/tekpyramid", "root", "root");
		} catch (Exception e) {
		}
	}

	public void closeDbconnection() throws SQLException {
		con.close();

	}
	public ResultSet executeSelectQuery(String query) {
		ResultSet result=null;
		try {
			Statement stat = con.createStatement();
			      result=stat.executeQuery(query);
		}
		catch(Exception e) {}
		return result;
		
		
	}

	
	public int executeNonSelectquery(String query) {
				 int result =0;
		   try {
				Statement stat = con.createStatement();
				result= stat.executeUpdate(query);
				
		} catch (Exception e) {}
			  return result;
}
}