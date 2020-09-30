package com.training.utils;

import java.sql.*;

public class ConnectionUtility {
	
	public static Connection getDerbyConnection() {
		
		Connection derbyConnection = null;
		
		try {
			String derbyURL = "jdbc:derby:SampleDB;create=true";
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			derbyConnection = DriverManager.getConnection(derbyURL);
			
			if(derbyConnection!=null) {
				System.out.println("Connection Established");
			}
			
			Statement stmt;
			stmt = derbyConnection.createStatement();
			String sql = "create table invoice(invoiceNumber int primary key,customerName varchar(20),amount double)";
			stmt.execute(sql);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return derbyConnection;
	}

}
