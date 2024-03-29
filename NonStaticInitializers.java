package javaNotes;

public class NonStaticInitializers {
	// Any statement written within a block is called as non-static initializers.
	
	// It execute at the time of object creation.
	
	//  No. of copies of non-static initializers = No. of object created.
	// no. of static variables and static method = 1 copy.
	static int x;
	int y;
	public static void demo() {
		System.out.println("I am static method");
	}
	
	public void test() {
		System.out.println("I am non-static method");
		demo();
	}
	
	public static void demo2() {//I am static method
		demo();//we cannot access static method inside a static method.
		//test();//we cannot access non-static method inside a static method.
		x=1;// we can access static variable inside static method..
		//y=2;//we cannot access non-static variable inside non-static method.

	}
	
	public void test1() {//I am non-static method
		demo();//we can access static method inside a non-static method.
		test();//we can access non-static method inside a non-static method.
		x=1;// we can access static variable inside non-static method.
		y=2;//we can access non-static variable inside non-static method.
	}
	
	static {
		demo();//we can access static method inside static initializers.
		//test();//we cannot access non-static method inside static initializers.
		x=1;// we can access static variable in side static initializer.
		//y=2;//we cannot access non-static variable inside static initializer.
	}
	
	{
		demo();//we can access static method inside non-static initializers.
		test();//we can access non-static method inside non-static initializers.
		x=1;// we can access static variable in side non-static initializer.
		y=2;//we can access non-static variable inside non-static initializer.
	}

}
// _____________________________________________________________________________________________
/*		Inside a		| static initializer|non-static initial |static method  |NonStaticMethod|							
 * _____________________|___________________|___________________|_______________|_______________|
 * static variable		|		yes			|		yes			|		yes		|		yes		|
 * 						|					|					|				|				|
 * non-static variable	|		no			|		yes			|		no		|		yes		|
 * 						|					|					|				|				|
 * static method		|		yes			|		yes			|		yes		|		yes		|
 * 						|					|					|				|				|
 * non-static method	|		no			|		yes			|		no		|		yes		|
 * _____________________|___________________|___________________|_______________|_______________|
*/