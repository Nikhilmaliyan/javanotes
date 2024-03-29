package javaNotes;

public class LoopsInJava {
	// Loops are used to do some specific tasks again and again
	public static void main(String[] args) {
		int i=0;
		//while loop we use while loop when a there are unknown number of iterations
		while(i<5){//condition
			System.out.println("hey");
			i++;
		}
		
		//do while it works similarly as while loop but 
		//it will execute the statement at least one.
		
		do {
			System.out.println("hello");
		i++;}while(i<10);
		
		//for :we use for loop when a there are known number of iterations.
		for(int n=0; n<5;n++) {//variable declaration;condition;Updation
			System.out.println("hi");
		}
		
	}

}
