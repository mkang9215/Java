package com.kang.functions;
import java.util.Random;
import java.util.Scanner;

public class Recursive {
	// 4 -> 1+2+3+4
	public static int getSum(int n) {
		int ans = (n == 1) ? 1 : (getSum(n - 1) + n);
		return ans;
	}
	
	// Factorial
	// 4 -> 1*2*3*4
	public static int getFactorial(int n) {
		int ans = (n == 1) ? 1 : (getFactorial(n - 1) * n);
		return ans;
	}

	// Factorial without recursive
	public static int getFacto(int n) {
		int ans = 1;
		for (int i = n; i > 0; i--) {
			ans *= i;
		}
		return ans;
	}

	// Fibonacci
	// 1 : 1
	// 2 : 1
	// 3 : (1+1) = 2
	// 4 : (1+2) = 3
	// 5 : (2+3) = 5
	// 6 : (3+5) = 8
	public static int getFibonacci(int n) {
		int ans = (n == 1 || n == 2) ? 1 : (getFibonacci(n - 1) + getFibonacci(n - 2));
		return ans;
	}
	
	// print random even number between 0~n
	public static int getRandEvenNum(int n) {			
		Random r = new Random();
		int i = r.nextInt(n);
		int ans = (i % 2 == 0) ? i : getRandEvenNum(n);
		return ans;		
	}		

	public static void main(String[] args) {
		int sum = getSum(3);
		System.out.println(sum);

		int factorial = getFactorial(4);
		System.out.println(factorial);

		int facto = getFacto(4);
		System.out.println(facto);

		int fibonacci = getFibonacci(6);
		System.out.println(fibonacci);
		
		Scanner k = new Scanner(System.in);
		System.out.print("Let's get random even number between 0 and: ");
		int n = k.nextInt();
		int i = getRandEvenNum(n);
		System.out.println(i);

	}
}
