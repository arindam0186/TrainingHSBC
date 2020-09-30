package com.training.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.StudentDAOImpl;
import com.training.models.Student;

/**
 * Servlet implementation class StudentsServlet
 */
@WebServlet("/students")
public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student ramesh = new Student("Ramesh", Arrays.asList(10,20,30,40));
		Student suresh = new Student("Suresh", Arrays.asList(20,30,40,50));
		Student mahesh = new Student("Mahesh", Arrays.asList(30,40,50,60));
		
		StudentDAOImpl dao = new StudentDAOImpl(Arrays.asList(ramesh,suresh,mahesh));
		
		List<Student> students = dao.getAllStudents();
		
		request.setAttribute("studentList", students);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("showStudents.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
