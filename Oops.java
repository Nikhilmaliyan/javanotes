package javaNotes;

public class Oops {
	//		Oops - it stands for Object Oriented Programming System
	
	//In java everything must be in the form of object.
	//Object is anything that have a physical existence
	
	//    				*Class*
	//	class is a blueprint for the object to be created.
	
	// new : It is a keyword in java which is used to create a abject.
	// new create a object inside a heap area and return with the address of the Object.
	
	/*
	 * 									Constructor
	 * 	It is a special method that is used to initialize objects.
	 * constructor do three tasks
	 * 1. it will load all the non-static members(non-static variables with its default values,
	 *  non-static methods)
	 * 2. it will execute all the non-static initializers.
	 * 3. it will execute the user written/defined information.
	 * 
	 *  then a new keyword return with a address of the memory allocated to object which must be
	 *   stored inside variable of class name type.
	 *  
	 */

	/*	Contain all the Static method and
	 *  Static Variables.
	 * 			________________			 ___________________					_________Heap Area__________
	 * 			|  Static Pool	|			 |	  Stack Area    |					|						   |
	 * 			|				|			 |	  ___________	|					|						   |
	 * 			|  Company		|            |    |e1 | OA1	|	|					|						   |
	 * 			|_______________|            |__________________|					|						   |
	 * 		____________________________________________________					|	____________________   |
	 * 		|Employee		e1 =		new		Employee()	   |					|	|Employee	    |OA1|  |
	 * 		|__________________________________________________|					|	|empid = 0			|  |
	 * 		_____________________________________________________					|	|sal = 0.0			|  |
	 * 		|DataType\  |Object reference  | ^^	    |Constructor|					|	|job = null			|  |
	 * 		|Class name |Variables of class| ||										|	|___________________|  |
	 * 								_________||_____________________				|						   |
	 * 								|1. new will allocate			|				|						   |
	 * 								|   memory in heap area			|				|						   |
	 * 								|2. it will do 3 tasks			|				|						   |
	 * 								|3. new will return address		|				|						   |
	 * 								|   of the space allocated		|				|						   |
	 * 								|4. address[OA1] Stored in e1.	|				|						   |
	 * 								|_______________________________|				|__________________________|
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
