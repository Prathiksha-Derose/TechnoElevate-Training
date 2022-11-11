package com.te.javabasics.comparator;

import java.util.Comparator;

public class StudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.studentId-o2.studentId;
	}
}
