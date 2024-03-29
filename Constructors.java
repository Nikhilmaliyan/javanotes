package javaNotes;

public class Constructors {
	
	// It is type of a method which have same name as class name.
	// A constructor must not be a return type method and cannot be static.
	
	// Type of constructor
	
	// 1. default constructor : it is a constructor(non-parameterised) which automatically created by compiler itself.
	
	//		programmer view									//		compiler view
	/*
	 *		class Student{											class Student{ 
	 *																Student(){    // non-parameterised constructor //default constructor
	 *
	 *	 																}
	 *		}														}
	 */
	
	//	2. custom constructor/user defined constructor: constructor which is design by the programmer himself.
	
	//	if a custom constructor is created by the user the default constructor will not be created  by the compiler.
	
	static {
		System.out.println("I am static initializer");
	}
	{
		System.out.println("I am non-static initializer");
	}
	public Constructors() {// non-parameterised constructor created by the user.
		System.out.println("I am constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method starts");
		Constructors c1 = new Constructors();
		Constructors c2 = new Constructors();
		System.out.println("Main methos ends");
	}

}
