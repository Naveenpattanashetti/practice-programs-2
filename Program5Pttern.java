package demo.java;

import java.util.Scanner;

public class Program5Pttern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number ");
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println("enter number is posative");

		} else if (input > 0) {
			System.out.println("enter number is negative");

		} else {
			System.out.println("enter number is zero");
		}

	}

}
