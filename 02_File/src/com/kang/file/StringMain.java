package com.kang.file;

import java.io.FileReader;
import java.util.StringTokenizer;

public class StringMain {
	public static void main(String[] args) {

		String s = new String("Let's write a new string.");
		System.out.println(s.charAt(2));
		
		System.out.println(s.length());

		System.out.println(s.substring(1, 5));
		
		System.out.println(s.endsWith("."));
		
		System.out.println(s.contains("write"));
		
//		s += " Don't use it this way for Big Data"; 
		
		System.out.println(s.concat(" Let's write it this way"));


		StringBuffer sb = new StringBuffer(s);
		sb.append("YAY");
		sb.append("WOW");
		String ss = sb.toString();
		System.out.println(ss);
		
		String data = "name/20/180/80";
		String[] sAr = data.split("/");
		System.out.println(sAr[0]);
		System.out.println(sAr[1]);
		System.out.println(sAr[2]);
		System.out.println(sAr[3]);
		
		String data2 = "How do I split string?";
		StringTokenizer st = new StringTokenizer(data2, " ");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		for (int i = 1; i < 15; i++) {
			String s3 = String.format("bus%02d.txt", i);
			System.out.println(s3);
		}
	}
}
