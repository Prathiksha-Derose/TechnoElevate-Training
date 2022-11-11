package com.te.javabasics.comparator;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.studentMarks-o2.studentMarks;
	}

}
