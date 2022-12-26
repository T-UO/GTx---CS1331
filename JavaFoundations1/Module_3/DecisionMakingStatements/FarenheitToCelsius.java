import java.util.Scanner;

public class FarenheitToCelsius{
	public static void main(String[] Args) {
		
		// Example 1
		
		/*
		int saturdayFarenheit;
		int sundayFarenheit;
		saturdayFarenheit = 78;
		sundayFarenheit = 81;
		double saturdayCelsius = (5.0/9) * (saturdayFarenheit -32);
		double sundayCelsius = (5.0/9) * (sundayFarenheit -32);
		System.out.println("Weekend Averages");
		System.out.println("Saturday: " + saturdayCelsius);
		System.out.println("Sunday: " + sundayCelsius);
		boolean headToPark = saturdayFarenheit > 69 ? true : false;
		*/

		// Example 2

		/*
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        System.out.print("Enter your preferred Celsius label: ");
        String cText = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
        System.out.printf("%s %-10s %,.1f \n", day, cText, celsius);
		*/

		// Example 3 - if statement

        /*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Farenheit  value: ");
		int farenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		double celsius = (5.0/9) * (farenheit - 32);
		System.out.println(day + " Farenheit: " + farenheit);
		System.out.printf("%s %.1f \n", day + " Celsius: ", celsius);
		if (farenheit > 70)
			System.out.println("Yay! Go to park.");
		*/
		
		// Example 4 - if/else statement

		/*
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius:", celsius);
       	
       	if(fahrenheit >= 70){System.out.println("Yay! Go to park.");}
       	else{System.out.println("Stay home where there's wi-fi and learn 1331 online");}
		*/



       	// Example 5 - if/else statement with logical operators

       	/*
		final int MIN_PARK_TEMP = 70;
		final int MAX_PARK_TEMP = 90;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit: ");
		int fahrenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		double celsius = (5.0 / 9) * (fahrenheit - 32);

		System.out.println(day + " Fahrenheit: " + fahrenheit);
		System.out.printf("%s %.1f  \n", day + " Celsius:", celsius);
		if((fahrenheit >= MIN_PARK_TEMP) && (fahrenheit <= MAX_PARK_TEMP)) {
			System.out.println("Yay! It's at least "
								+ MIN_PARK_TEMP
								+ " degrees but under"
								+ MAX_PARK_TEMP
								+".");
			System.out.println("Time to go to park.");
		}
		else{System.out.println("Stay home and learn 1331 online");}


		*/

		// Example 6 - if/else statement with logical operators; if it's raining

		/*
		final int MIN_PARK_TEMP = 70;
		final int MAX_PARK_TEMP = 90;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit: ");
		int fahrenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		double celsius = (5.0 / 9) * (fahrenheit - 32);

		boolean raining = false;
		System.out.print("Is it raining? (y/n): ");
		String rainInput = input.next().toLowerCase();
		if(rainInput.startsWith("y")) {
			raining = true;}

		System.out.println(day + " Fahrenheit: " + fahrenheit);
		System.out.printf("%s %.1f  \n", day + " Celsius:", celsius);
		if((fahrenheit >= MIN_PARK_TEMP) && (fahrenheit <= MAX_PARK_TEMP) && raining) {
			System.out.println("Yay! It's at least "
								+ MIN_PARK_TEMP
								+ " degrees but under"
								+ MAX_PARK_TEMP
								+".");
			System.out.println("Time to go to park.");
		}
		else{System.out.println("Stay home and learn 1331 online");}
		*/

		// Example 7 - Nested if statements

		final int MIN_PARK_TEMP = 70;
		final int MAX_PARK_TEMP = 90;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit: ");
		int fahrenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		String day = input.next();
		double celsius = (5.0 / 9) * (fahrenheit - 32);

		boolean raining = false;
		System.out.print("Is it raining? (y/n): ");
		String rainInput = input.next().toLowerCase();
		if(rainInput.startsWith("y")) {
			raining = true;}

		System.out.println(day + " Fahrenheit: " + fahrenheit);
		System.out.printf("%s %.1f  \n", day + " Celsius:", celsius);
		if((fahrenheit >= MIN_PARK_TEMP) && (fahrenheit <= MAX_PARK_TEMP)) {
			System.out.println("Yay! It's at least "
								+ MIN_PARK_TEMP
								+ " degrees but under"
								+ MAX_PARK_TEMP
								+".");
			if(raining) {
				System.out.println("Look up fun things to do in the rain.");
			}
			else {System.out.println("Time to go to park.");}
		}
	System.out.println("Bye");
	}
}




