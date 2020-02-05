package com.qa.oop;

public class Runnerandquestions {
	
public static void main(String[]args) {
	
//	System.out.println("hello world");
	
	String planet = "hello world";
	System.out.println(planet);
	
//	Animal cat =new Animal();
	System.out.println(Methods.getMessage("changing string agaian")); //Create a method that accepts a String as a parameter, and then outputs it to the console.
	
//4 Modify your method to return a String once called, which you then use to output to the screen.
	
	
//1 Create a method that accepts two integers as an input, then returns the integer that is the sum of these two parameters.
	
	
	System.out.println(Methods.getSum(6+8, 4+17));
	
	
///5 Create the following additional 3 methods that each take 2 parameters
	//:a.Multiplication – which takes 2 numbers and returns the product.
	//b.Subtraction – which takes 2 numbers, then returns the result of subtraction.
	//c.Division – which takes 2 numbers and returns the result of division.
	
	System.out.println(Methods.getMultiply(3, 4));
	
	System.out.println(Methods.getSubtraction(10, 4));
	
	System.out.println(Methods.getDivide(2, 24));
	
	//3 Your Division method may have returned the wrong result; this was because we were using ints,
	//rather than doubles.  Modify the Division method so that it takes double parameters 
	//and return a Double if not already
	
	System.out.println(Methods.getDivide2(14, 25));
	
	//4 	With the Division method, the sum should only execute if the first parameter is smaller 
	//than the second, otherwise it prints out a message saying that the division cannot be performed.
	
	//A person takes 3 exams in college, Physics, Chemistry and Biology, each exam can have a maximum of 150 marks.  #
	//When all the exam marks have been added together, we can find the overall percentage that the person has got by 
	//multiplying their score by 100 and then dividing by 450.
	//1 	Create the results class, this class has 5 variables, Physics, Chemistry and Biology, total and percentage. This class should also have 2 methods:
	//a.	Method 1 - displays the results that the person got for each exam and then the total mark.  Try to make the output neat and bespoke for each exam.
	//b.	Method 2 - which finds and displays the percentage that the person received for the exams overall.
int physics = 12;
int chemistry = 35;
int biology = 111;

	Results results = new Results(physics, chemistry, biology);
	results.displayResults();
}

}
