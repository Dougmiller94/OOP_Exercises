package com.qa.oop;

import java.util.ArrayList;
import java.util.List;

public class Results {
	
	//A person takes 3 exams in college, Physics, Chemistry and Biology, each exam can have a maximum of 150 marks.  #
		//When all the exam marks have been added together, we can find the overall percentage that the person has got by 
		//multiplying their score by 100 and then dividing by 450.
		//1 	Create the results class, this class has 5 variables, Physics, Chemistry and Biology, total and percentage. This class should also have 2 methods:
		//a.	Method 1 - displays the results that the person got for each exam and then the total mark.  Try to make the output neat and bespoke for each exam.
		//b.	Method 2 - which finds and displays the percentage that the person received for the exams overall.

	private int physics;
	private int chemistry;
	private int biology; 
	private int total;
	private int percentage;
	
public Results (int physics, int chemistry, int biology) 
		 {
	
	this.physics = physics;
	this.chemistry = chemistry;
	this.biology = biology;
	this.total = physics + chemistry + biology;
	this.percentage = total*100/450;
}
	

public void displayResults() {
	System.out.println("physics " + physics);
	System.out.println("biology " + biology);
	System.out.println("chemistry " + chemistry);
	System.out.println("total " + total);
	System.out.println("percentage =" + percentage);
	
	if (checkPercentage() == true) {
		System.out.println("pass");
	} else {
		System.out.println("fail");
	}
}

private boolean checkPercentage() {
	if (percentage < 60) {
		return false;
	} 
	else {
		return true;
	}
}
	
//	finalResults.add(physics);
//	finalResults.add(biology);
//	finalResults.add(chemistry);
//	finalResults.add(total);
//	finalResults.add(percentage);
	
	
	

	

}
