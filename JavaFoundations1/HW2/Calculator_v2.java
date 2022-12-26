import java.util.Scanner;
public class Calculator_v2{
	public static void main(String[] Args){
		
		Scanner input = new Scanner(System.in);
		int firstVal, secondVal;
		int val = 0;
		double choice = 0;
		String addition, subtraction, division, multiplication, alphabetize;
		String x = ""; String y = "";

		System.out.print("List of operations: add subtract multiply divide alphabetize");
		System.out.print("Enter an operation");
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
				System.out.print("Please enter first integer: ");
				try{val_one = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return/* return*/;}
				System.out.print("Please enter second integer: ");
				try{val_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return/*return*/;}
				results = val_one + val_two;
				System.out.print("Answer: " + results);
				break;
			case 2: // subtraction
				int sub_one = 0; int sub_two = 0;
				System.out.print("Please enter first integer: ");
				try{sub_one = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				System.out.print("Please enter second integer: ");
				try{sub_two = input.nextInt();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				results = sub_two - sub_one;
				System.out.print("Answer: " + results);
				break;
			case 3: // Multiplication
				double thirdVal = 0, fourthVal =0;
				System.out.print("Please enter first double: ");
				try{thirdVal = input.nextDouble();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				System.out.print("Please enter second double: ");
				try{fourthVal = input.nextDouble();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				double multi = thirdVal * fourthVal; System.out.printf("Answer: %.2f", multi);
				break;
			case 4: // Division
				double firstDiv = 0, secondDiv =0;
				System.out.print("Please enter first double: ");
				try{firstDiv = input.nextDouble();}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				System.out.print("Please enter second double: ");
				try{secondDiv = input.nextDouble(); if (secondDiv == 0) {System.out.print("Invalid input entered. Terminating..."); return;}}
				catch (Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				double div = firstDiv / secondDiv; System.out.printf("Answer: %.2f", div);
				break;
			case 5: // Alphabetize
				System.out.print("Enter your first word: ");
				try{x = input.nextLine();}
				catch(Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				System.out.print("Enter your second word: ");
				try{y = input.nextLine();}
				catch(Exception e) {System.out.print("Invalid input entered. Terminating..."); return;}
				if (x.compareTo(y) > 0) {System.out.print(y + " comes before " +  x + " alphabetically");}
				else if (x.compareTo(y) == 0) {System.out.print(x + " equals to " + y + " alphabetically");}
				else {System.out.print(x + " comes before " + y + " alphabetically");}
				break;


			}
	}

}


