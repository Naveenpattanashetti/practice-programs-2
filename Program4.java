package demo.java;

import java.util.Scanner;

////Write a program to find the factorial value of any number
//entered through the keyboard.// 

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ; ///to hold number
		int fact = 1; /// to hold a fatorial
		System.out.println("please enter a nuber ");
		num =sc.nextInt();
		for (int i =1; i<=num; i++) {
			System.out.println(fact);	
		 	fact =i*fact;
		//	  fact *= i;
			System.out.println("factorial " +fact);
			
			
			
		}
		 
	}

}
