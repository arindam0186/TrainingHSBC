package com.training.daos;

import java.util.List;

import com.training.ifaces.StudentDAO;
import com.training.models.Student;

public class StudentDAOImpl implements StudentDAO {
	
	private List<Student> students;

	public StudentDAOImpl(List<Student> students) {
		super();
		this.students = students;
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public List<Integer> getDetails(String studentName) {
		List<Integer> marks = null;
		for(Student eachStudent: students) {
			if(eachStudent.getStudentName().equalsIgnoreCase(studentName)) {
				marks = eachStudent.getMarksList();
			}
		}
		return marks;
	}

}
