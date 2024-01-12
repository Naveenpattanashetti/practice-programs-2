package demo.java;

public class Person {
	
private String  name ; ;
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


private int age;
	
	
	public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}


	public static void main(String[] args) {
		
		 Person person1 = new Person("Ean Craig", 11);	 
		 Person person2 = new Person("budduu", 12);
		 Person person3 = new Person("navi", 13);	 
		 Person person4 = new Person("sacchi", 14);
		 
		 System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
		 System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
		 System.out.println(person3.getName() + " is " + person3.getAge() + " years old.\n");
		 System.out.println(person4.getName() + " is " + person4.getAge() + " years old.\n");
		 
	 
		
	}

}
