package com.kang.uc.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import com.kang.uc.student.Student;

// Set
public class Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs.size()); // delete duplicate

		// Set -> List
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		for (Integer i : al) {
			System.out.println(i); // random order
		}
		System.out.println("=============");

		HashSet<Student> students = new HashSet<Student>();

		students.add(new Student("Elie Caddens", 28, 92, 82, 72));
		students.add(new Student("Elie Caddens", 28, 92, 82, 72));
		System.out.println(students.size()); // 2 added

		Student s = new Student("Bradley Maric", 33, 84, 82, 100);
		students.add(s); 
		students.add(s); // s is added 2 times but 1 added
		System.out.println(students.size());
		System.out.println("=============");

		// create lotto
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		while (true) {
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() == 6) {
				break;
			}
		}
		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for (Integer i : lotto2) {
			System.out.println(i);
		}
	}
}
