import java.util.Scanner;
public class Calculator{
	public static void main(String[] Args){
		
		Scanner input = new Scanner(System.in);

		int firstVal, secondVal;
		double thirdVal = 0, fourthVal =0;
		int val = 0;
		double choice = 0;
		String addition, subtraction, division, multiplication, alphabetize;
		String x = ""; String y = "";

		System.out.print("Enter an operation: " + "Addition, " + "Subtraction, " + "Multiplication, " + "Division " + "Alphabetize ");
		String userChoice = input.nextLine().toLowerCase();
		
				// Addition
		if (userChoice.equals("addition")) {val = 1;}
				// Subtraction
		else if (userChoice.equals("subtraction")) {val = 2;}
			// The below would go into the body of the else if
			// System.out.print("Please enter first integer: ");
			// try{firstVal = input.nextInt();}
			// catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
			// System.out.print("Please enter second integer: ");
			// try{secondVal = input.nextInt();}
			// catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				

					// Multiplication
		else if (userChoice.equals("multiplication")) 
			{
			System.out.print("Please enter first double: ");
			try{thirdVal = input.nextDouble();}
			catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
			System.out.print("Please enter second double: ");
			try{fourthVal = input.nextDouble();}
			catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				 double multi = thirdVal * fourthVal; System.out.printf("Answer: %.2f", multi);
				choice = 3;}

					// Division
		else if (userChoice.equals("division")) 
			{
			System.out.print("Please enter first double: ");
			try{thirdVal = input.nextDouble();}
			catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
			System.out.print("Please enter second double: ");
			try{fourthVal = input.nextDouble(); if (fourthVal == 0) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}}
			catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				double div = thirdVal / fourthVal; System.out.printf("Answer: %.2f", div);
				choice = 4;}

		else if (userChoice.equals("alphabetize"))
			{
			System.out.print("Enter your first word: ");
			try{x = input.nextLine();}
			catch(Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
			System.out.print("Enter your second word: ");
			try{y = input.nextLine();}
			catch(Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				if (x.compareTo(y) > 0) {System.out.print(y + " comes before " +  x + " alphabetically");}
				else if (x.compareTo(y) == 0) {System.out.print(x + " equals to " + y + " alphabetically");}
				else {System.out.print(x + " comes before " + y + " alphabetically");}}

		else {System.out.println("Invalid input entered. Terminating...");
			System.exit(0);}

			// switch statement for int values
		int results = 0;
		switch (val) {
			case 1: // addition
				int val_one = 0; int val_two = 0;
				System.out.print("Please enter first integer: ");
				try{val_one = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				System.out.print("Please enter second integer: ");
				try{val_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				results = val_one + val_two;
				System.out.print("Answer: " + results);
				break;
			case 2: // subtraction
				int sub_one = 0; int sub_two = 0;
				System.out.print("Please enter first integer: ");
				try{sub_one = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				System.out.print("Please enter second integer: ");
				try{sub_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); System.exit(0);}
				results = sub_two - sub_one;
				System.out.print("Answer: " + results);
				break;}
	}

}


