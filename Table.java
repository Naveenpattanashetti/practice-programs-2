package demo.java;
////Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number. ///
import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int num;
		 System.out.println("please enter number");
		 num = sc.nextInt();
		 System.out.println("multiplication"+num);
		 for(int i =1; i <=10; i ++ ) {
			 System.out.println(num +" x " + i + " = " + (num*i) );
			 
		 }
		 
		 
		
	}

}
