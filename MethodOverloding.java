package demo.java;

////// METHOD OVER LOADING CONCEPTS/////
class calculator { ////// method 1////
	public int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	//////// method 2/////
	///// method of overloding //// its having same method name but having diffrent
	//////// parameters////

	public int add(int n1, int n2, String n3) {
		int result = n1 + n2;
		return result;
	}

}

public class MethodOverloding {

	public static void main(String[] args) {

		calculator cal = new calculator();
		int r = cal.add(1, 20);
		System.out.println(r);

	}

}
