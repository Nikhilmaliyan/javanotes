package javaNotes;

public class TypeCasting {
	public static void main(String[] args) {
		byte a= 10;
		
		// TypeCasting
		// there are two type of TypeCasting
		
		// 1.Primitive TypeCasting: In primitive type casting there are two types
		
		// Data widening
		int b = a;//this is called data widening here low data is converted to a larger data type byte-> integer
		int c= (int)a;
		
		//Data narrowing 
		short d= 10;
		byte e= (byte)d;// d is converted in smaller data type then store in byte type variable
		
		//2.Non-Primitive TypeCasting: In non-primitive type casting there are two types
		
		// UpCasting it is done child to parent class
		
		// DownCasting it is done parent to child
		// if upcasting is done by child to parent the downcasting can be done only in same child class not to sibling classes
	
		// 				UPCASTING 
		//  A SUPER CLASS REFERENCE REFERING TO ANY OF ITS SUB-CLASS IS KNOWN AS UPCASTING.
		//  REFERENCE IS OF SUPER CLASS AND OBJECT OF CHILD CLASS TYPE.
		
		// 		FRUIT F = new APPLE();
		
		//   			***NOTE***
		//		IT IS ALSO KNOWN AS GENERALISZTION.
		
		/*
		 * 	CHARACTERISTIC OF UPCASTING 
		 * 
		 * IN CASE OF UPCASTING USING SUPER CLASS REFERENCE WE CAN ONLY ASSCESS INHERITED VARIABLES AND METHODS BUT WE CANNOT 
		 * ACCESS SUB CLASS SPECIFIC VARIABLES AND METHOD.
		 * 
		 * USINGSUPER CLASS REFERENCE WHEN WE CALL A OVERRIDEN METHOD CHILD IMPLEMENTATION WILL EXECUTES.
		 * 
		 */
		
		//				DOWNCASTING 
		// DOWNCASTING KNOWN AS SPECIALIZATION CONVERTING THE PARENT TYPE TO ITS SPECIFIC CHILD TYPE IS KNOWN AS DOWNCASTING.
		// IF WE UPCAST FROM ONE CLASS, WE HAVE DOWNDOWN CAST TO THE SAME CLASS, ELSE WE GET A CLASS CAST EXCEPTION.
		// 			APPLE A = (APPLE)F;
		
		//	 WHILE DOWNCAST WE HAVE TO DOWN CAST TO SAME CLASS BUT WE CANNOT DOWNCAST TO IT SIBLING CLASSES.
		
		/*				instanceOF
		 * 	IT I A KEYWORD IN JAVA WHICH IS USED TO CHECK WHAT KING OF OBJECT IS STORE IS PRESENT IN A PARTICULAR REFERNECE.
		 * IT RETURNS A BOOLEAN VALUE BY CHECKING THE TYPE OF OBJECT.
		 */
	}

}
