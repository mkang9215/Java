package com.kang.uc.main;

import java.util.ArrayList;
import java.util.Arrays;

// Collection - List, Set, Map
//	List: ArrayList, Vector, ...
//	Set: HashSet, TreeSet, ...
//	Map: HashMap, HashTable, ...

public class Collection {
	public static void main(String[] args) {

		// int[] ar = new int[5]; 
		int[] ar = { 86, 97, 76, 96, 90 }; 
		Arrays.sort(ar);
		for (int i : ar) {
			System.out.println(i);
		}
		System.out.println("===============");	
		
		int[] arr = { 123, 4, 25, 35, 121 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============");	

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		System.out.println(al);
		System.out.println("===============");	
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("x");
		al2.add("y");
		al2.add("z");

		System.out.println(al2.size());
		System.out.println(al2.get(0));
		System.out.println(al2);

		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("--------------");
		al2.add("a");
		al2.add(1, "added");
		al2.set(2, "changed");
		al2.remove(3);

		String s = null;
		for (int j = 0; j < al2.size(); j++) {
			s = al2.get(j);
			System.out.println(s);
		}
		System.out.println("-------------");

		for (String s2 : al2) {
			System.out.println(s2);
		}
		System.out.println(al2);

	}
}
