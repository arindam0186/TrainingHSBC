package com.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.NoSuchElementException;

import com.training.entity.Student;

public class StudentServiceImpl {

	private HashMap<Integer,Student> studentList = null;

	public StudentServiceImpl() {
		super();
		studentList = new HashMap<>();
	}
	
	private void init() {
		this.studentList.put(1, new Student(1,"Ramesh"));
		this.studentList.put(2, new Student(2,"Suresh"));
		this.studentList.put(3, new Student(3,"Mahesh"));
	}
	
	public Student findById(int key) {
		init();
		if(this.studentList.get(key)!=null) {
			return this.studentList.get(key);
		}
		else {
			throw new NoSuchElementException("Student Not Found");
		}
	}
	
	public List<Student> findAll() {
		init();
		
		List<Student> list = new ArrayList<>();
		
		Set<Map.Entry<Integer, Student>> set = studentList.entrySet();
		
		for(Map.Entry<Integer, Student> eachStudent: set) {
			list.add(eachStudent.getValue());
		}
		return list;
	}
	
	
}
