package com.kang.uc.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.kang.uc.student.Student;

// Map(dictionary) : size can change, no order, key-value pair 
//	HashMap, HashTable, ...

public class Map {
	public static void main(String[] args) {
		// HashMap<Key, Value>
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Carb", 50);
		hm.put("Fat", 500);
		hm.put("Protein", 5000);

		System.out.println(hm.get("Fat"));
		System.out.println("-------------");

		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("Emmy Trehearne", new Student("Emmy Trehearne", 20, 100, 90, 80));		
		students.put("Tremain Cassy", new Student("Tremain Cassy", 25, 80, 70, 60));
		students.put("Henri Rikard", new Student("Henri Rikard", 30, 95, 85, 75));
		students.put("Elie Caddens", new Student("Elie Caddens", 28, 92, 82, 72));
		students.put("Bradley Maric", new Student("Bradley Maric", 33, 84, 82, 100));

		// show keys(student names)
		Set<String> sNames = students.keySet();
		ArrayList<String> sNames2 = new ArrayList<String>(sNames);
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		sNames2.sort(c);
		for (String s : sNames2) {
			System.out.println(s);
		}

		// Search by student name
		Scanner scan = new Scanner(System.in);
		System.out.print("Student full name: ");
		String name = scan.nextLine();
		students.get(name).print();
		scan.close();
	}
}
