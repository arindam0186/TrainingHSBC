package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.entity.Student;
import com.training.service.StudentServiceImpl;
import com.training.utils.MyGsonParser;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		
//		String employee = "{ 'id':101, 'name':'ramesh'}";
//		
//		out.println(employee);
		
		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentServiceImpl service = new StudentServiceImpl();
		
		Student student = service.findById(studentId);

		MyGsonParser parser = new MyGsonParser();
		
		String jsonResp = parser.transformToGson(student);
		
		out.println(jsonResp);
		
//		List<Student> list = service.findAll();
//		
//		jsonResp = parser.transformToGson(list);
//		
//		out.println(jsonResp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		
		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentServiceImpl service = new StudentServiceImpl();
		
		Student student = service.findById(studentId);

		MyGsonParser parser = new MyGsonParser();
		
		String jsonResp = parser.transformToGson(student);
		
		out.println(jsonResp);
		
	}

}
