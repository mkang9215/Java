package com.kang.uc.main;

import java.util.ArrayList;
import java.util.Comparator;

import com.kang.uc.student.Student;

public class List {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s = new Student("Emmy Trehearne", 20, 100, 90, 80);
		students.add(s);
		
		students.add(new Student("Tremain Cassy", 25, 80, 70, 60));
		students.add(new Student("Henri Rikard", 30, 95, 85, 75));
		students.add(new Student("Elie Caddens", 28, 92, 82, 72));
		students.add(new Student("Bradley Maric", 33, 84, 82, 100));
		
		System.out.println(students.size());
		students.get(0).print();		

		// print all students
		System.out.println("\n=== All Students ===");
		for (int i = 0; i < students.size(); i++) {
			students.get(i).print();
		}
		
		// sort by name
		System.out.println("\n=== Sort by name ===");
		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String o1name = o1.getName();
				String o2name = o2.getName();
				return o1name.compareTo(o2name); // ascending
//				return o2name.compareTo(o1name); // descending
			}
		};
		students.sort(c);
		for (Student student : students) {
			student.print();
		}		
		
		// sort by age
		System.out.println("\n=== Sort by age ===");
		Comparator<Student> c2 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer o1age = o1.getAge();
				Integer o2age = o2.getAge();
				return o2age.compareTo(o1age);
			}
		};
		students.sort(c2);
		for (Student student : students) {
			student.print();
		}		

		// sort by average grade
		System.out.println("\n=== Sort by average grade ===");		
		Comparator<Student> c3 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				Double o1ave = (o1.getKor() + o1.getEng() + o1.getMath()) / 3.0;
				Double o2ave = (o2.getKor() + o2.getEng() + o2.getMath()) / 3.0;
				return o2ave.compareTo(o1ave);
			}
		};
		students.sort(c3);
		for (Student student : students) {
			student.print();
		}
		System.out.println("\n=== First and last grade ===");
		
		// First grade student
		students.get(0).print();
		// Last grade student
		students.get(students.size() - 1).print();
	}
}
