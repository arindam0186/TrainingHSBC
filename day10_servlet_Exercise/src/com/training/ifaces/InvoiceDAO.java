package com.training.ifaces;

import com.training.entity.*;
import java.util.Collection;

public interface InvoiceDAO {

	Collection<Invoice> findAll();
	Collection<Invoice> sortedBy(String propName);
	Collection<Invoice> sortedByInvoiceNumber();
	boolean add(Invoice entity);
	boolean add(Invoice ...invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice entityToBeUpdated, Invoice entityToUpdate);
}
