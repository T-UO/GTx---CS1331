import java.util.Scanner;
public class Calculator_v3{
	public static void main(String[] Args){
		
		Scanner input = new Scanner(System.in);
		int firstVal, secondVal;
		int val = 0;
		double choice = 0;
		String add, subtract, divide, multiply, alphabetize;
		String x = ""; String y = "";

		System.out.println("List of operations: add subtract multiply divide alphabetize");
		System.out.println("Enter an operation: ");
		String userChoice = input.nextLine().toLowerCase();

				// Addition
		if (userChoice.equals("add")) {val = 1;}
				// Subtraction
		else if (userChoice.equals("subtract")) {val = 2;}
				// Multiplication
		else if (userChoice.equals("multiply")) {val = 3;}
				// Division
		else if (userChoice.equals("divide")) { val = 4;}
				// Alphabetize
		else if (userChoice.equals("alphabetize")) {val = 5;}
		else {System.out.println("Invalid input entered. Terminating...");
			return;}

		// switch statement for int values
		int results = 0;
		switch (val) {
			case 1: // addition
				int val_one = 0; int val_two = 0;
				System.out.println("Enter two integers: ");
				try{val_one = input.nextInt(); val_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return/* return*/;}
				results = val_one + val_two;
				System.out.print("Answer: " + results);
				break;
			case 2: // subtraction
				int sub_one = 0; int sub_two = 0;
				System.out.println("Enter two integers: ");
				try{sub_one = input.nextInt(); sub_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				System.out.print("Please enter second integer: ");
				results = sub_one - sub_two;
				System.out.print("Answer: " + results);
				break;
			case 3: // Multiplication
				double thirdVal = 0, fourthVal =0;
				System.out.println("Enter two doubles: ");
				try{thirdVal = input.nextDouble(); fourthVal = input.nextDouble();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				double multi = thirdVal * fourthVal; System.out.printf("Answer: %.2f", multi);
				break;
			case 4: // Division
				double firstDiv = 0, secondDiv =0;
				System.out.println("Enter two doubles: ");
				try{firstDiv = input.nextDouble(); secondDiv = input.nextDouble(); if (secondDiv == 0) {System.out.print("Invalid input entered. Terminating..."); return;}}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				double div = firstDiv / secondDiv; System.out.printf("Answer: %.2f", div);
				break;
			case 5: // Alphabetize
				System.out.println("Enter two words: ");
				try{x = input.next(); y = input.next();}
				catch(Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				if (x.compareToIgnoreCase(y) > 0) {System.out.print("Answer: " + y + " comes before " +  x + " alphabetically.");}
				else if (x.compareToIgnoreCase(y) == 0) /* || x.toLowerCase().compareTo(y.toLowerCase()) == 0)*/ {System.out.print("Answer: Chicken or Egg.");}
				else if(x.compareToIgnoreCase(y) < 0) {System.out.print("Answer: " + x + " comes before " + y + " alphabetically.");}
				else break;


		}

	}

}


