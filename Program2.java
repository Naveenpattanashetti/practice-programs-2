package demo.java;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
	//	 Get a number from the user and print whether it is positive or negative number
		
	Scanner sc = new Scanner(System.in); //FOR USER INPUT 
	
	System.out.println("input number"); //TO PRINTING A LINE
	
	int input  = sc.nextInt(); ///scans the next token of the input data 
	
	if(input >0) {
		
		
		System.out.println("the number is posative ");
		
	}
	else if(input <0) {
		
		System.out.println("the number is negative ");
		
	}
   
	else {
		
		System.out.println("the number is zero ");
	}
	}

}
