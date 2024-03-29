package javaNotes;
import java.util.Scanner;//import java.util.* OR import java.util.Scanner;
//							we have to import Scanner class from Java.util

public class ScannerClass {
	
	//Scanner class is a predefined class in java which have some inBuilt method in it to take input
	//from user or we can say it read input from user.
	//

	//	To use Scanner class we have to create an object for it. 
	
	/*
	 * 	Method											Description
	 * nextBoolean()							Reads a boolean values from User
	 * nextByte()							   	Reads a byte values from User
	 * nextDouble()								Reads a double values from User
	 * nextFloat()								Reads a float values from User
	 * nextInt()								Reads a int values from User
	 * nextLine()								Reads a String values from User
	 * next()							     	Reads a String values from User
	 * nextLong()								Reads a long values from User
	 * nextShort()								Reads a short values from User
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		System.out.println(a);
		
		sc.close();
	}
	
}
