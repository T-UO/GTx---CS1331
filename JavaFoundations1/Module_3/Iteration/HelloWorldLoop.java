public class HelloWorldLoop {
	public static void main(String[] Args){

		// intro to while loop

		/*
		int counter = 0;
		while (counter < 10) {
			System.out.println("Hello, World");
			counter++;
		} */

		// An infinite loop

		/*
		int lineNum = 10;
		while (lineNum > 0) {
			System.out.println("Hello, World");}*/

		// Do while loop

		/*
		int lineNum = 1;
		do {System.out.println("Hello, World " + lineNum);
			lineNum++;
		}
		while(lineNum <=10);*/

		// for loop ; increment
		int lineNum;
		for (lineNum = 1; lineNum <= 10; lineNum++) {
			System.out.println("Hello, World! " +lineNum);
		}
		System.out.println("lineNum's value after the loop is " + lineNum);

		// decrement
		
		for (lineNum = 10; lineNum >= 1; lineNum--) {
			System.out.println("Hello, World! " +lineNum);
		}
		System.out.println("lineNum's value after the loop is " + lineNum);

		// update / exponent

		for(int pow = 1; pow <= 40; pow*=2) {
			System.out.println(pow);
		}

		// nested while loop

		int outerCounter = 1;
		while(outerCounter <= 5) {
			int innerCounter = 1;
			while (innerCounter <= 10) {
				System.out.println("Hello, World!");
				innerCounter++;
			}
			outerCounter++;
		}

	}
}