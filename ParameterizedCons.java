package javaNotes;

public class ParameterizedCons {
	/*
	 * In this constructor we pass on-static variables as an argument.
	 * 
	 * for parameterized constructor then an object must be created with same number of arguments, 
	 * same sequence of argument , and data with the same type.
	 */
	
	String name;
	int age;
	char gender;
	
	public ParameterizedCons(String name, int age, char gender) {//Parameterized constructor
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		
		ParameterizedCons S1= new ParameterizedCons("nikhil",24,'m');
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.gender);
	}
	//this: this is the keyword which is used to access object variables and methods.
	// we can use this keyword only inside a constructor

}
