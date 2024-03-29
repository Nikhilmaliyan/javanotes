package javaNotes;

public class ScopeOfVariables {
	static int x=10;//global variable visibility through the entire class
	public static void test() {
		int x=20;// local variable
		// we cannot access the variable which reside in a particular method although we can call a method inside a main method
	}
	// two variable can have same name if they are written in different method block like here main block and test block
	public static void main(String[] args) {
		int x=10;// local variable
		// variable can have duplicate name or same name if the other variable is written within outside the block but within the class block 
		{
			// *int x=20;* //two local variable cannot have same name or duplicate name
		}
		// *int x=20;* // variable can have duplicate name or same name if the other
		//variable is written within outside the block but within the class block 
		
		System.out.println(x);//10
		System.out.println(ScopeOfVariables.x);//10 
		// we can global variable using class name ScopeOfVariables .<- it used to access static member of a class
		
	}

}
