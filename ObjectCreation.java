package javaNotes;

public class ObjectCreation {
	static String company ="IOCl";//static variable
	int empid ;// non-static variable
	double sal;// non-static variable
	String job;// non-static variable
	
	public ObjectCreation(int empid, double sal, String job) {//Constructor
		this.empid=empid;
		this.sal=sal;
		this.job=job;
	}
	
	public static void main(String[] args) {
		ObjectCreation obj = new ObjectCreation(01,10000,"Officer");//Object creatoin with refernce obj
		System.out.println(ObjectCreation.company+" "+obj.empid+" "+obj.sal+" "+obj.job);
		
		// to access static variable we use classname.
		// and to access non-static variable we need to create a object first then only we can access them
	}

}
