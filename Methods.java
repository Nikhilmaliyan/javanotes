package javaNotes;

public class Methods {
	//methods are some set of instruction to do some specific tasks
	
	//*Arguments*
	
	/*
	   arguments are parameter which we pass while declaring a method it is called as formal arguments
	   arguments which we pass while calling a methods it is called as actual arguments
	   Arguments must be same as that of formal argument or can be of smaller than of actual argument
	*/
	
	/*
	 * METHOD DECLARTION
	 * 														METHOD SIGNATURE
	 * ___________________________________________________________________________
	 * |AccessModifier	AccessSpecifier		ReturnType		MethodName(Parameters)|
	 * |__________________________________________________________________________|
	 * public			static				DataType
	 * private			non-static			Void
	 * protected
	 * default	
	 */

	
	//there are two type of methods
	//1.Method with return type
	//any method except void must have a return type
	//it can have a return type of any data type
	//for example
	public static int MethodWithReturnType() {
		System.out.println("Hi");
		return 1;//return must be the last statement
		//we can have only one return type in a method
	}
	
	//2.Method without return type
	//method with return type void do not return any thing
	public static void MethodWithoutReturnTtype() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println(MethodWithReturnType());// we can access return type method inside a print statement
		MethodWithReturnType();
		
		MethodWithoutReturnTtype();// we cannot write method without return type inside print statement
	}
	

}
