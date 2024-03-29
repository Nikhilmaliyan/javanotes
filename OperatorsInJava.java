package javaNotes;

public class OperatorsInJava {
	public static void main(String[] args) {
		int a=10,b=20;
		//arithmetic operators
		// (+,-,*,/,%)
		System.out.println(a+b);//30 it will give sum of two variables
		System.out.println(b-a);//10 it will give difference value of two variables
		System.out.println(a*b);//200 it will give product value of two variables
		System.out.println(b/a);//2 it will divide two variables 
		System.out.println(b%a);// it will divide the two variables and gives reminder
		System.out.println("===================================================");
		
		//relational operators
		//(<,>,<=,<=) it will return with boolean values either true or false
		
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println("===================================================");
		
		//logical operators 
		// it returns with a boolean value (true/false)
		//AND logic operator
		System.out.println(a<b&b>a);//true if both condition are true
		//OR logic operator
		System.out.println(a<b|a>b);//true if any one condition is true
		//NOT logic operator
		System.out.println(a!=b);//return true if condition is false or return false if condition is true
		System.out.println("===================================================");
		
		//Assignment operator
		//there are two type of assignment operator
		
		// 1.single assignment operator
		int c = 10;// = is a single type assignment operator 
		
		//2.Compound assignment
		//combination of two operator
		
		int d= 10;
		d += c;
		System.out.println(d);//20
		
		
		//Concatenation
		// + will act when it encounter a string no operation will happen but print the values as it as.
		System.out.println(a+"Hello"+b+"hi"+c);//10Hello20hi10
		
		
		
		
		
		
	}

}
