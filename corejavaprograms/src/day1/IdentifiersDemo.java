package day1;

public class IdentifiersDemo {

	public static void main(String[] args) {
		/*	int for = 13;// error because keyword cannot be identifier
		System.out.println("value of the number variable is : "+ for);*/
		
		/*
		  int number 2 = 13; //error because do not add space within identifier
		  System.out.println("value of the number variable is : "+ number 2);
		 */
		
		// error because Identifier can not starts with @, # 
		//int @number3 = 10;
		
		//Valid Identifier Examples
		
		int $number = 67; //starts with $
		System.out.println("value of the number variable is : "+ $number);
	
		String studentName="Aniket"; //use camelcase
		System.out.println("value is : "+ studentName);

	}

}
