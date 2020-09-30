package com.training.models;

import java.util.Arrays;
import java.util.List;

public class Student {

	private String studentName;
	private List<Integer> marksList;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, List<Integer> marksList) {
		super();
		this.studentName = studentName;
		this.marksList = marksList;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Integer> getMarksList() {
		return marksList;
	}
	public void setMarksList(List<Integer> marksList) {
		this.marksList = marksList;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", marksList=" + marksList + "]";
	}
	
	
	
}
