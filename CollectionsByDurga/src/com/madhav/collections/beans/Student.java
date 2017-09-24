package com.madhav.collections.beans;

import java.util.Date;

public class Student {

	private int studentId;
	private String studentName;
	private Date studentDOB;
	
	public Student(int studentId,String studentName,Date studentDOB) {
		this.studentId = studentId;
		this.studentName=studentName;
		this.studentDOB=studentDOB;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentDOB(Date studentDBO) {
		this.studentDOB=studentDOB;
	}
	public Date getStudentDOB() {
		return this.studentDOB;
	}
	public String toString() {
		String student = "Student details are: [ Student ID:\t"+this.getStudentId()+"\n\t\t\tStudent Name:"+this.getStudentName()+" "+this.getStudentDOB();
		return student;
	}
}
