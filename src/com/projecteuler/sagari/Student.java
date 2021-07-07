package com.projecteuler.sagari;

import java.util.Comparator;

public class Student implements Comparable {

	private String name;
	private int rollno;
	private int studentage;
	
	public Student(String name, int rollno, int studentage) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.studentage = studentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

//	public int compareTo(Student comparestu) {
//		
//		int compareage = ((Student)comparestu).getStudentage();
//		return this.studentage - compareage;
//	}
//	
	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + name + ", age=" + studentage + "]";
    }


public int compareTo(Student comparestu) {

	int age=((Student)comparestu).getStudentage();

	return this.studentage - age;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return (int)(o2.getRollno() - o1.getRollno());
//	}
//	};

	

}
