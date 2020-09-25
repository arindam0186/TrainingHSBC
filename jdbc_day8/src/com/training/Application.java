package com.training;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.daos.InvoiceDAOImpl;


public class Application {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//System.out.println(ConnectionUtility.getDerbyConnection());
	
	Invoice john = new Invoice(101,"John",45000.00);
	Invoice cena = new Invoice(102,"Cena",55000.00);
	Invoice rob = new Invoice(103,"Rob",65000.00);
	Invoice bert = new Invoice(104,"Bert",75000.00);
	Invoice shyam = new Invoice(105,"shyam",45000.00);
	
	InvoiceDAO dao = new InvoiceDAOImpl();
	
	boolean result=dao.add(shyam);
	if(result) {
	System.out.println("ROW ADDED");
	
	System.out.println(dao.findAll());
	}

}
}