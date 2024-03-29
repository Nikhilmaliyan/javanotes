package javaNotes;

public class PrinciplesOfOops {
	
	
	
	/*				ENCAPSULATION
	 * 
	 * IT IS A PROCESS OF BINDING OR WRAPPING OF A DATA MEMBER WITH ITS DATA HANDLER METHOD 
	 * THAT IS GETIT() AND SETIN() IS KNOWN AS AS ENCAPSULATION.
	 * 
	 * 				ADVANTAGE
	 *  WE CAN PROTECT THE DATA VALIDATION.
	 *  WE CAN PROVIDE DATA VALIDATION.
	 *  WE CAN MAKE THE DATA READ ONLY OR MODIFY ONLY OR BOTH.
	 *  
	 */ 
	
	/*
	 * 				JAVA BEAM CLASS
	 * THE FULLY ENCAPSULATED CLASS IS CALLED AS JAVA BEAM CLASS.
	 * 
	 * THE CLASS MUST BE PUBLIC AND DATA MEMBER MUST BE PRIVATE.
	 * 
	 * EACH DATA MEMBER SHOULD HAVE GETTER OR SETTER METHOD.
	 */
	
	/*
	 * 						NOTE
	 *  *it restrict the direct access and provides indirect access through getter and setter methods.
	 *  *getter setter method must be public
	 *  *getter method must have the return type same as variable.
	 *  *setter must be void type must have a parameter.
	 */
	
	// RELATION SHIP IN JAVA (ONE OBJECT HAVING ANY RELATION WITH OTHER OBJECTS
	//1. HAS A RELATIONSHIP
	//2. IS A RELATIONSHIP
	
	//				HAS A RELATIONSHIP
	// WHENEVER AN INSTANCE OF ONE CLASS IS USED IN ANOTHER CLASS, IT IS CALLED HAS A RELATIONSHIP.
	
	// 1.COMPOSITION: IF ONE OBJECT LOGICALLY OR INDEPENEDTLY EXSITS WITHOUT THE OWNER OBJECT IS KNOWN AS COMPOSITION.
	// IT IS ALSO CALLED AS STRONG HAS A RELATIONSHIP.
	// EX: CAR - ENGINE, PLANT-LEAVES
	// 2.AGGRIGATION: IF ONE OBJECT CAN INDEPENDENTLY EXISTS  WITHOUT THE OWNER OBJECT IS CALLED AS AGGRIGATION.
	//IT IS ALSO CALLED WEAK HAS A RELATION.
	// EX: MUSIC PLAYER, PLAY GROUND-COLLEGE
	
	//				IS A RELATIONSHIP
	// WHENEVER ONE CLASS INHERITS ANOTHER CLASS, IT IS CALLED AS IS A RELATIONSHIP.
	
	/*
	 * 					POLYMORPHISM
	 * THERE ARE TWO TYPE OF POLYMORPHISM
	 * 1.COMPILE TYPE POLYMORPHISM
	 * 2.RUNTIME TYPE POLYMORPHISM
	 */
	
	//				METHOD OVERLOADING
	
	// *IN A CLASS WE HAVE MORE THAN ONE METHOD HAVING SAME NAME BUT DIFFERENT NUMBER OF ARGUMENTS , SEQUENCE OF ARGUMENTS , TYPE OF ARGUMENTS.
	// *IT IS ALSO CALLED AS COMPILE TYPE POLYMORPHISM WHERE COMPILER WILL TAKE DECISION WHICH METHOD TO EXECUTE.
	
	// RETURN TYPE DOES NOT MATTER IN METHOD OVERLOADING.
	// IT CAN BE DONE IN SAME CLASS.
	
	/*
	 * 				INHERITANCE
	 *  THE PROCESS OF acquiring the properties & behavior from one class to another class is called Inheritance
	 *  it represents parent child relationship that IS A RELATIONSHIP.
	 *  
	 *  			Advantages of Inheritance
	 *  1. code re-useability .
	 *  2. avoid code redundancy.
	 *  3. indirect PolyMorphism achieved .
	 *  4. to achieve generalization.
	 */
	//				*note*
	//constructor cannot be inherits.(we have to use super keyword)
	//to achieve indirect PolyMorphism we use extend keyword.
	/*
	 * 				Super class
	 * it is a class from where sub class inherits  the feature it is also called as base class or parent class.
	 * 
	 * 				Sub class
	 * It is a class which inherits the feature it is also called as child class or derived class or extend class.
	 */
	
	/*
	 *				Initializer with inheritance 
	 *
	 * 1. static initializers of parent class will executes then child class static initializers .(static initializers will executes only once)
	 * 2. non-static initializers of parent class will executes then child class non-static initializers will executes.
	 * 
	 *  			Constructor with inheritance
	 *  
	 *  if we don't create a constructor the compiler will automatically will create an empty (non-parameterized constructor).
	 *  if there is an inheritance the compiler will automatically call a parent class constructor using super() call statement.
	 *  
	 *  SUPER() CALL STATEMENT : it is used to call the constructor from an immediate parent class.
	 *  (it must be the first argument inside a constructor and we cannot have more then one super() call statements inside a constructor)
	 *  Super() call statement will only call an empty constructor of the parent class.
	 *  
	 *  if there is no empty constructor then compiler will throw an error for default super() call statement.
	 *  
	 *  if there is a parameterized constructor inside a parent class with no empty constructor then it is mandatory to have the constructor with
	 *  the super() call statement else we will get an error.
	 */ 
	
	// 					INHERITANCE
	/*
	 * 	THERE ARE FIVE TYPES OF INHERITANCE 
	 * 1. SINGLE LEVEL INHERITANCE
	 * 
	 * 			PARENT CLASS
	 * 			CHILD CLASS
	 * 
	 * 2. MULTI LEVEL INHERITANCE
	 * 
	 * 			PARENT CLASS
	 * 			CHILD CLASS
	 * 			GRAND CHILD CLASS
	 * 
	 * 3. HIERARCHIACL INHERITANCE
	 * 
	 * 			PARENT CLASS
	 * 	CHILD1 CLASS		CHILD2 CLASS
	 * 
	 * 4. MULTIPLE INHERITANCE
	 * 	
	 * PARENT1 CLASS		PARENT2 CLASS
	 * 			CHILD CLASS
	 * 
	 * 5. HYBRID INHERITANCE
	 * 
	 */

		// 			SUPER 
		// it is a keyword in java which is used to represent immediate parent class variables and methods.
	
	
	/*
	 *			Method overriding 
	 *
	 *  It is a process of providing the sub-class specific method implementation for inherited method.
	 *  
	 * *whenever we override a method it is high standard to write @override notation before the child class implementation*
	 * 
	 * while overriding a method the number of arguments, sequence of arguments , type of arguments must be same.
	 * access modifier must be same of parent class and child class or higher visibility.
	 *   		  
	 */
	
	/*
	 * 						***NOTE***
	 * All the classes in java automatically inherits the super most class called as Object class 
	 * 
	 *  						Object Class
	 *  
	 *  						Parent class
	 *  
	 *  						Child class
	 */
	
	/*
	 * 						METHOD OVERLOADING										METHOD OVERRIDING
	 * 
	 * 		1.			IT HAPPEN WITHIN A CLASS.						IT HAPPENS IN PARENT CLASS AND CHILD CLASS.						
	 * 
	 * 		2.			IN THIS PARAMETER MUST BE DIFFERENT.			IN THIS PARAMETER MUST BE SAME.
	 * 
	 * 		3.			RETURN TYPE CAN BE DIFFERENT.					RETURN TYPE MUST BE SAME.
	 * 
	 * 		4.			ACCESS MODIFIER CAN BE ANY TYPE.				ACCESS MODIFIER MUST BE SAME OR HIGHER VISIBILITY.		
	 */
	
	/*
	 * 						ABSTRACTION
	 * 
	 * THE METHOD WHICH IS INCOMPLETE (IT HAS ONLY DECLARATON BUT DON'T HAVE IMPLEMENTATION) IS CALLED AS ABTRACT METHOD.
	 * 
	 * IT IS DENOTED BY A KEYWORD ABSTRACT
	 * 
	 * IT IS TERMINATED BY USING SEMICOLON ;
	 * 
	 * ABSTRACT METHOD IS LIKE CONCRTE METHOD WHICH HAS RETURN TYPE , METHOD SIGNATURE BUT IT CANNOT HAVE IMPLEMENTATION.
	 * 
	 * **IF THE METHOD IS ABSTRACT THAN THE CLASS MUST ALSO BE ABSTRACT CLASS.
	 */
	
	/*
	 * 						ABSTRACT CLASS
	 * THE CLASS WHICH IS INCOMPLETE IS KNOWN AS ABSTRACT CLASS.
	 * 
	 *  IT CAN HAVE ABSTRACT METHOD AND CONCRTE METHOD ALSO.
	 *  ABSRACT CLASS MUST BE DENOTED BY ABSTRACT KEYWORD.
	 *  
	 *  IT CAN HAVE STATIC METHOD AND CONSTRUCTOR.
	 *  
	 *  WE CANNOT CREATE AN OBJECT OF ABSTRACT CLASS BUT WE CAN USE IT AS A REFERNECE.
	 *  
	 *   				ABSTRACT CLASS								CONCRTE CLASS
	 *   IT CAN HAVE ABSTRACT METHOD AS WELL AS			IT CAN HAVE ONLY CONCRTE METHODS.
	 *   CONCRTE METHODS.
	 *   
	 *   WE CANNOT INSTANTIATE AN ONJECT CLASS.			WE CAN INSTANTIATE AN ON=BJECT CLASS.
	 *   
	 *   EVERY ABSTRACT CLASS MUST HAVE A CHILD			THERE NEED NOT BE IN CHILD CLASS.
	 *   CLASS WHICH PROVIDES IMPLEMENTATION TO
	 *   INCOMLETE METHOD.
	 */

}
