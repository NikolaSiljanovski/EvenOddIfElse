import java.util.Scanner;

public class EvenOdd { // Public Class

	public static void main(String[] args) { // main method

		
		int a,b,c,d,e,V,opsto=0;
			int sumap=0,sumanep=0;
			
			
			Scanner inkeyboard = new Scanner(System.in); 		//Inserting scanner in code
			
			
			
			System.out.println("Enter your first number: "); 		// printing to user to enter first number,second,etc.
			a = inkeyboard.nextInt(); 								// Inserting the variable to scanner so user can type and save
			
			System.out.println("Enter your second number: ");
			b = inkeyboard.nextInt();
			
			System.out.println("Enter your third number: ");
			c = inkeyboard.nextInt();
			
			System.out.println("Enter your fourth number: ");
			d = inkeyboard.nextInt();
			
			System.out.println("Enter your fifth number: ");
			e = inkeyboard.nextInt();
		
		
		
		
			if (a % 2 == 0) {  
				sumap=sumap + a;
			} else {
				sumanep=sumanep+a;
			}
			
			
			if (b % 2 == 0) {
				sumap=sumap + b;
			} else {
				sumanep=sumanep + b;
			}
			
			if (c % 2 == 0) {
				sumap=sumap + c;
			} else {
				sumanep=sumanep + c;
			}
			
			if (d % 2 == 0) {
				sumap=sumap + d;
			} else {
				sumanep=sumanep + d;
			}
			
			if (e % 2 == 0) {
				sumap=sumap + e;
			} else {
				sumanep=sumanep + e;
			}
		
		
		
			
			
			System.out.println("The sum of even number is" + " " + sumap);
			System.out.println("The sum of odd number is" + " " + sumanep);
			
			
			
			
		System.out.println("Insert a number from 1 to 100 : ");
		V = inkeyboard.nextInt();
		
		
		if (V % 2 == 0) {
			System.out.println("Your entered number is even");
		}	else {
			System.out.println("Your entered number is odd");
		}
			
		
			
			
	}

}
