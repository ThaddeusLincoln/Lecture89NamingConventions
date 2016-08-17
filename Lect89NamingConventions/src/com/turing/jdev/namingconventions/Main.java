package com.turing.jdev.namingconventions;

public class Main {
	
	public static void main(String[] args){
		
		/*MyWindow myWindow = new MyWindow("Java dev");
		myWindow.setVisible(true);*/
		
		int n = 10;
		System.out.println("Sum of " + n + " : " + Series.nSum(n));
		
		for(int i = 1; i <= n; i++){
			System.out.println("Factorial of " + n + " : " + Series.factorial(i));
		}
		
		for(int i = 1; i <= n; i++){
			System.out.println("Fibonacci of " + n + " : " + Series.Fibonacci(i));
		}
		
	}
}
