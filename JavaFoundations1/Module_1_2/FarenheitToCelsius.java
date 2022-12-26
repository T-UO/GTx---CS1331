import java.util.Scanner;

public class FarenheitToCelsius{
	public static void main(String[] args) {
		
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
	}
}