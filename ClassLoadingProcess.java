package javaNotes;

public class ClassLoadingProcess {
	/*
	 * In class loading process- There are four Steps
	 * 1.Method Area
	 * 2.Static Pool
	 * 3.Stack Area
	 * 4.Heap Area
	 */

	//								Method Area
	//
	//It stores all the Methods - a specific ADDRESS is assign to every Method
	/*
	 *  Address		OA1				Address		OA2			Address		OA3 		Address		OA4
	 * _______demo()_______		 _______test()_______	 ____return()________	 _______main()_______	
	 * |		code	   |	 |		code		 |	 |		code		 |   |		code		 |
	 * |				   |	 |					 |	 |					 |   |					 |
	 * |___________________|	 |___________________| 	 |___________________|   |___________________|
	 */
	
	//				Static Pool
	//It stores all the static Variables(with it values)
	
	/*
	 * __________________________________________________
	 * |				a=10	,b=a					 |
	 * |			method		address					 |
	 * |			___________________					 |
	 * |			|demo()		|	OA1|				 |
	 * |			|test()		|	OA2|				 |
	 * |			|return()	|	OA3|				 |
	 * |			|main()		|   OA4|				 |												 
	 * |			|__________________|				 | 
	 * |_________________________________________________|    
	 */
	
	/*
	 * 								Static Area
	 * A frame is allocated to each method when it is called in stack manner
	 * after the execution of function which was called the allocated frame will be deleted
	 * the first frame is allocated is always to main method  
	 */
	
	/*
	 * 							Heap Area
	 * java object reside inside a area which is called Heap area
	 * it area of memory which stores object instantiated by application running on the JVM
	 */
	
}
