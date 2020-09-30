package com.training.ifaces;

import java.util.List;

import com.training.models.Student;

public interface StudentDAO {

	public List<Student> getAllStudents();
	public List<Integer> getDetails(String studentName);
}
