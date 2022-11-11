package com.te.javabasics.comparator;

public class Student {
 String studentName;
 int studentId;
 int studentMarks;
 int studentAge;
 
 
 
public Student(String studentName, int studentId, int studentMarks, int studentAge) {

	this.studentName = studentName;
	this.studentId = studentId;
	this.studentMarks = studentMarks;
	this.studentAge = studentAge;
}



@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentMarks=" + studentMarks
			+ ", studentAge=" + studentAge + "]";
}
 
 
}
