package com.kang.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("What do you want to write down? : ");
		String s = k.next();

		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("D:\\kang/write.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(s + "\r\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
