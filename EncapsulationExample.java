package demo.java;

/// EncapsulationExample ///
class Human {
	// This is instance variables we can access without using methods///
//	String name ;   
//	int age;  	

/// THIS IS PRIVATE VARIABLE WE CAN ACCESS BY USING METHODS  THIS IS CALLED ENCAPULATTION//	
	
	
	
//	private String name = "navin";
//	private int age = 13;

/// TO SET A NAME AND AGE////	
	private String name;
	private int age;

	public int getage() {
		return age;

	}

	public void setage(int a) {
		age = a;
	}

	public String getname() {
		return name;
	}

	public void setname(String s) {
		name = s;

	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
//FOR INSTANCE VARIABLE ///		
		Human obj = new Human();
//		obj.name ="navi";
//		obj.age= 34;
//		System.out.println(obj.name);
//		System.out.println(obj.age);
//		
		//// FOR PRIVATE VARIABLE////
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		obj.setage(12);
		obj.setname("sachin");
//// TO SET A NAME AND AGE /////
		System.out.println(obj.getname());
		System.out.println(obj.getage());
	}

}
