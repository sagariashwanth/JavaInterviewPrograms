package com.projecteuler.sagari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistStudent {

	public static void main(String[] args) {

		ArrayList<Student> studentArray = new ArrayList<>();
		studentArray.add(new Student("John", 111, 23));
		studentArray.add(new Student("Messi", 222, 29));
		studentArray.add(new Student("Ronaldo", 333, 31));

//		Collections.sort(studentArray,Student.StuNameComparator);
//				
//
//					
//
//		for (Student str : studentArray) {
//			System.out.println(str);
//		}

		/*
		 * Without using lambda expression
		 */
		Collections.sort(studentArray, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getRollno() - o2.getRollno());
//			}
//		});
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getName().compareTo(o2.getName()));
		}
	});
		/*
		 * Using Lambda with compareTo
		 */
//		(o1,o2)-> (int) (o1.getName().compareTo(o2.getName()));
//		Collections.sort(studentArray, (o1,o2)-> (int) (o1.getName().compareTo(o2.getName())));

		/*
		 * Using lambda expression as Comparator is an functional interface
		 */
//		Collections.sort(studentArray,( o1,  o2) ->(int) (o2.getRollno() - o1.getRollno()) );
//		( o1,  o2) ->(int) (o2.getRollno() - o1.getRollno());
		Collections.sort(studentArray);
		System.out.println(studentArray);

	}

}
