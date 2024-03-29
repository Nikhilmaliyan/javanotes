package javaNotes;

public class ConditionalStatement {
	public static void main(String[] args) {
		int i=1;
		 // Conditional Statement is used when we have to check for a condition
		
		//if is use to check condition if its true it will execute the if block otherwise skip it
		if(i<10)
			System.out.println("hello");
//		if & else is use to check condition if its true it will execute the if block else Else block will execute
		if(i>2)
			System.out.println("hi");
		else
			System.out.println("bye");
		System.out.println("-----------------------------------------------");
		
		// we cannot write else without out if but we can write if with or without else block
		
//       else if
		
		if(i<4)
			System.out.println("less than 4");
		else if(i<3)
			System.out.println("less than 3");
		else if(i<2)
			System.out.println("less than 2");
		else
			System.out.println("i is 1");
		
		//nested if else
		System.out.println("-----------------------------------------------");
		if(i<10)
		{
			if(i<5) {
				if(1<2) {
					System.out.println("less than 2");
				}
				else
					System.out.println("i is"+i);
			}
		}
		
		
		
		
		
	}

}
