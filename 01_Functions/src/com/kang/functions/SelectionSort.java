package com.kang.functions;

public class SelectionSort {

	public static void sort(int[] ar) {
	
		int min = 0;
		int minIndex = 0;
		int temp = 0; 
		for (int i = 0; i < ar.length - 1; i++) {
			min = ar[i]; 
			minIndex = i;
			for (int j = i + 1; j < ar.length; j++) { 
				if (min > ar[j]) {  
					min = ar[j]; 
					minIndex = j; 
				}
			} 
			temp = ar[minIndex];
			ar[minIndex] = ar[i];
			ar[i] = temp; 
		}
	}
	
	public static void main(String[] args) {
		int[] ar = { 12, 45, 62, 27, 15, 78, 52, 23 };
		SelectionSort.sort(ar);
		
		for (int i : ar) {
			System.out.println(i);			
		}
	}
}