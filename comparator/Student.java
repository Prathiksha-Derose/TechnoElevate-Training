package com.te.javabasics.comparator;

import java.util.Objects;

public  class Student {
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



@Override
public  int hashCode() {
	return Objects.hash(studentId);
}

@Override
public boolean equals(Object obj) {
	Student other = (Student) obj;
	if (studentId != other.studentId) 
		return false;
	if(studentId==other.studentId) {
		try {
			throw new InvalidChoiceException("Enter a valid input");
		} catch (InvalidChoiceException e) {
			System.out.println(e.getMessage());
		}
	}
	return true;
}
}



	

 

