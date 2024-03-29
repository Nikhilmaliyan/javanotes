package javaNotes;

public class ConsOverloading {
	/*
	 * 				Constructor overloading
	 *  In a class have can n number of constructor it is called constructor over loading.
	 *  
	 *   rule of constructor overloading
	 *   no.of arguments , sequence of argument, types of argument must be  different.
	 */
	String name;
	int age;
	char gender;
	public ConsOverloading(){
		//System.out.println("I am empty constructor");
	}
	public ConsOverloading(String name){
		this.name=name;//constructor chaining process
		//System.out.println("I am Name constructor");
	}
	public ConsOverloading(String name, int age){
		this(name);//constructor chaining process
		this.age=age;
		//System.out.println("I am Name and age constructor");
	}
	public ConsOverloading(String name, int age,char gender){
		this(name,age);//constructor chaining process :It is a process of call one constructor inside an another constructor.
		// this reduce code redundancy.
		this.gender=gender;
		//System.out.println("I am Name, age and gender constructor");
	}
	
	public static void main(String[] args) {
		
		ConsOverloading S1 = new ConsOverloading();
		ConsOverloading S2 = new ConsOverloading("nikhil");
		ConsOverloading S3 = new ConsOverloading("raj",21);
		ConsOverloading S4 = new ConsOverloading("kamal",23,'m');
		
		System.out.println(S1.name+" "+S1.age+" "+S1.gender);
		System.out.println(S2.name+" "+S2.age+" "+S2.gender);
		System.out.println(S3.name+" "+S3.age+" "+S3.gender);
		System.out.println(S4.name+" "+S4.age+" "+S4.gender);
	}

}
