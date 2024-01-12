package demo.java;

public class Exption {

	public static void main(String[] args) {
		int i = 0; ///// its throw exption in this  case catch block will work///
		// int i = 4; ///// in this case try block is work/////
		int j = 0;
		try {
			j = 18 / i;

		} catch (Exception e) {
			System.out.println("somthing went wrong");

		}

		System.out.println(j);
		System.out.println("bye..");

	}

}
