package javaNotes;

public class AccessModifier {
	public static void main(String[] args) {
		
		/*
		 * 		  						ACCESS MODIFIERS 
		 * 	PUBLIC    : ITS VISIBILITY IS THROUGHOUT THE PROJECT.
		 * 			    IF WE WANT TO USE IN DIFFERENT PACKAGE W HAVE TO IMPORT THE PACKAGE.
		 * 	PRIVATE   : ITS VISIBILITY IS WITHIN THE PACKAGE.
		 *			    WE CANNOT USE PRIVATE VARIALES BY EXTENDING
		 *			    PRIVATE VARIABLE ARE NOT INHERITED.
		 *  DEFAULT   : ITS VISIBILITY WITHIN THE PACKAGE.
		 *  PROTECTED : ITS VISIBILITY WITHIN THE PACKAGE BUT WE CAN ACCESS IN OTHER PACKAGE USING EXTENDS KEYWORD.
		 */
		
		/*								PUBLIC		PRIVATE		PROTECTED		DEFAULT
		 * 	ACCESS WITHIN
		 *  THE CLASS 					YES				YES			YES				YES
		 *  
		 *  ACCESS OUTSIDE CLASS		YES				NO			YES				YES
		 *  WITHIN PACKAGE
		 *  
		 *  DIFFERENT PACKAGE			YES				NO			NO				NO
		 *  
		 *  DIFFERENT PACKAGE BY		YES				NO			YES				NO
		 *  EXTENDS
		 *  
		 *  OUTSIDE CLASS	
		 *  USING EXTENDS				YES				NO			YES				YES
		 */
	}

}
