package com.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.InvoiceDAOImpl;
import com.training.entity.Invoice;

/**
 * Servlet implementation class InvoiceServlet
 */
@WebServlet("/invoice")
public class InvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = null;

		String invoiceNumber = request.getParameter("invoiceNumber");
		int id = Integer.parseInt(invoiceNumber);
		
		String customerName = request.getParameter("customerName");
		
		String amount = request.getParameter("amount");
		
		Invoice newInvoice = new Invoice(id, customerName, Double.parseDouble(amount));
		
		request.setAttribute("invoiceObject", newInvoice);
		dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
