package com.training;

import java.sql.*;

import com.training.utils.ConnectionUtility;

public class UsingTransactions {

	public static void main(String[] args) {

		Connection con = ConnectionUtility.getDerbyConnection();
		Savepoint point1 = null;
		
		try {
			con.setAutoCommit(false);
			String sqlOne = "insert into invoice values(?,?,?)";
			String sqlTwo = "inseert into invoice values(?,?,?)";
			
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			int rowUpdated = 0;
			
				pstmt = con.prepareStatement(sqlOne);
				pstmt.setInt(1, 899);
				pstmt.setString(2, "Kale");
				pstmt.setDouble(3, 4949);
				
				pstmt.executeUpdate();
				
				point1 = con.setSavepoint("point 1");
				
				pstmt2 = con.prepareStatement(sqlTwo);
				pstmt2.setInt(1, 899);
				pstmt2.setString(2, "Loke");
				pstmt2.setDouble(3, 4949);
				
				pstmt2.executeUpdate();
				
				
				con.commit();
				
		} catch (SQLException e) {
			try {
				con.rollback();
				System.out.println("Rolling Back");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
