package javaNotes;

public class Initializes {
	/*
	 * These are some set of code that are written within the block inside a class block
	 * 
	 * 	It is the first Executable Statement in the program
	 * 	it execute before main method but without main method it cannot executed it will throw a runtime error
	 * 	a class can have n number of initializers * we can also pass method inside a class block
	 */
	
	// *Static Initializer*
	// 
	static {
		System.out.println("I am Static initializer");
	}
	
	// *Non-Static Initializer*
	{
		System.out.println("I am Non-Static initializer");// non-static initializer will be executed , it will execute at time of object creations.
	}
	public static void main(String[] args) {
		System.out.println("Main method starts");
		System.out.println("Main method ends");
	}
	/*			OUTPUT
	 * I am Static initializer
       Main method starts
       Main method ends
	 */

}
