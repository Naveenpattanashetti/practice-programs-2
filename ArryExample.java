package demo.java;

//ARRY EXAMPLE//
public class ArryExample {

	public static void main(String[] args) {

		int nm[] = { 1, 2, 3, 4 };
		nm[1] = 5; // HAVE TO CHANGE VALUE/
		System.out.println(nm[0]); /// PRINTING VALUE OF INDEX ///
		System.out.println(nm[1]); /// PRINTING CHANGED VALUE OF ARRY /////
		int num[] = new int[4]; /// initially its having "0" in all index
		num[0] = 5;
		num[1] = 6; /// FOR PRINTING THE ALL VALUES///
		num[2] = 7;
		num[3] = 8;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);

////////////MULTI DIMENSION ARRY//////

		int a1[][] = new int[3][4]; // MULTI DIMENSION ARRY [3]ROWS [4] COLUMN//
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
