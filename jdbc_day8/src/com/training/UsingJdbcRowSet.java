package com.training;

import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;
import javax.sql.rowset.spi.*;

import com.training.entity.Invoice;
import com.training.utils.ConnectionUtility;

public class UsingJdbcRowSet {

	public static void main(String[] args) {
		
		String derbyURL = "jdbc:derby:SampleDB;create=true";

		Connection con = ConnectionUtility.getDerbyConnection();
		
		RowSetFactory fact;
		
		try {
			fact = RowSetProvider.newFactory();
			CachedRowSet rowSet = fact.createCachedRowSet();
			
			rowSet.setUrl(derbyURL);
			
			String sql = "select * from invoice";
			
			rowSet.setCommand(sql);
			
			rowSet.execute();
			rowSet.setPageSize(2);
			int i = 1;
			
			while(rowSet.nextPage()) {
				System.out.println("Page ======"+ i);
				while (rowSet.next()) {

					int invoiceNumber = rowSet.getInt("invoiceNumber");
					String customerName = rowSet.getString("customerName");
					double amount = rowSet.getDouble("amount");
					
					Invoice inv = new Invoice(invoiceNumber, customerName, amount);
					System.out.println(inv);
				}	
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
