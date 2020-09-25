package com.training.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.sql.*;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.ConnectionUtility;


public class InvoiceDAOImpl implements InvoiceDAO {
	
	private List<Invoice> invList;
	
	private Connection derbyConnection;
	
	public InvoiceDAOImpl() {
		super();
		this.invList = new ArrayList<Invoice>();
		
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
	}
	
	private Invoice getResult(ResultSet result) {
		
		int invoiceNumber = 0;
		String customerName = null;
		double amount = 0;
		try {
			invoiceNumber = result.getInt("invoiceNumber");
			customerName = result.getString("customerName");
			amount = result.getDouble("amount");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Invoice invoice = new Invoice(invoiceNumber, customerName, amount);
		return invoice;
	}

	@Override
	public Collection<Invoice> findAll() {
		
		String sql = "select * from invoice";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			ResultSet result = pstmt.executeQuery();
			
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			for(int i=1;i<=columnCount;i++) {
				System.out.println("====== Column: = "+metaData.getColumnName(i));
			}
			
			DatabaseMetaData dbInfo = this.derbyConnection.getMetaData();
			
			System.out.println(dbInfo.getDriverName());
			System.out.println(dbInfo.getDatabaseProductVersion());
			
			while(result.next()) {
				int invoiceNumber = result.getInt("invoiceNumber");
				String customerName = result.getString("customerName");
				double amount = result.getDouble("amount");
				
				Invoice inv = new Invoice(invoiceNumber, customerName, amount);
				this.invList.add(inv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		
		String sql = "insert into invoice values(?,?,?)";
		PreparedStatement pstmt = null;
		int rowUpdated = 0;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, entity.getInvoiceNumber());
			pstmt.setString(2, entity.getCustomerName());
			pstmt.setDouble(3, entity.getAmount());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return rowUpdated==1?true:false;
	}

	@Override
	public Invoice findById(int id) {
		
		String sql = "select * from invoice where invoiceNumber=?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();
			
			Invoice invoice = null;
			
			while(result.next()) {
				invoice = getResult(result);
			}
			return invoice;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean add(Invoice... invoices) {

		boolean result = false;
		for(Invoice invoice: invoices) {
			add(invoice);
			result = true;
		}
		
		return result;
	}

	@Override
	public boolean remove(Invoice entity) {
		
		return this.invList.remove(entity);
	}

	@Override
	public boolean update(Invoice entityToBeUpdated, Invoice entityToUpdate) {
		
		int index = 0;
		boolean result = false;
		if(this.invList.contains(entityToBeUpdated)) {
			index = this.invList.indexOf(entityToBeUpdated);
			this.invList.set(index, entityToUpdate);
			result = true;
		}
		return result;
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		
		Collections.sort(this.invList);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		
		switch(propName) {
		case "InvoiceNumber":
			Collections.sort(this.invList);
			return this.invList;
		case "CustomerName":
			Collections.sort(this.invList);
			return this.invList;
		}
		return null;
	}

}
