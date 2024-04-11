package com.springcore;

public class Student {
	private String studentName;
	private String studentAddress;

	private int studentId;
	public int getStudentId() {
		
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.print("Setting studentId ");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.print("Setting studentName ");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.print("Setting studentAddress ");
		this.studentAddress = studentAddress;
	}
	public Student(String studentName, String studentAddress, int studentId) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentId = studentId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + ", studentId=" + studentId
				+ "]";
	}
	
	
}
