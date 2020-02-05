package com.qa.oop;

public class Methods {
	
	public static String getMessage(String world) {
		return world; 
	}
	
	//1 Create a method that accepts two integers as an input, then returns the integer that is the sum of these two parameters.
	public static int getSum(int num, int num2) {
		return num + num2;
	}
	
//5 Create the following additional 3 methods that each take 2 parameters
	//:a.Multiplication – which takes 2 numbers and returns the product.
	//b.Subtraction – which takes 2 numbers, then returns the result of subtraction.
	//c.Division – which takes 2 numbers and returns the result of division.
	
	public static int getMultiply(int num1, int num2) {
		return num1 * num2;
	
	}
	
	public static int getSubtraction(int num1, int num2) {
		return num1 - num2;
	
	}
	
	public static int getDivide(int num1, int num2) {
		return num1 / num2;
	}
	
	//3 Your Division method may have returned the wrong result; this was because we were using ints,
		//rather than doubles.  Modify the Division method so that it takes double parameters 
		//and return a Double if not already
	
	public static double getDivide2(double num1, double num2) {
		return num1 / num2;
	}
	
	//4 	With the Division method, the sum should only execute if the first parameter is smaller 
	//than the second, otherwise it prints out a message saying that the division cannot be performed.
	
	
}
