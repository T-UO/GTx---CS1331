import java.util.Scanner;



public class FahrenheitToCelsiusBreak{
	public static void main(String[] Args){

		final int MIN_TEMP = -200;
		final int MAX_TEMP = 200;

		Scanner input = new Scanner(System.in);

		double totalFahrenheit = 0;
		int validFahrenheits = 0;
		int fahrenheit;

		/*
		for (int i =1; i <=  5; i++) {

			System.out.print("Enter a Fahrenheit value:	");
			fahrenheit = input.nextInt();
			if ((fahrenheit >= MIN_TEMP) && (fahrenheit <=MAX_TEMP)) {
				totalFahrenheit += fahrenheit;
				validFahrenheits++;
			}
			else{System.out.println("Invalid value."); break;}
		}
		if (validFahrenheits > 0) {
			System.out.println("Average Fahrenheit Temperature: " + totalFahrenheit/validFahrenheits);
		}
		*/


		// uses continue statement

		for (int i =1; i <=  5; i++) {

			System.out.print("Enter a Fahrenheit value:	");
			fahrenheit = input.nextInt();
			if ((fahrenheit >= MIN_TEMP) && (fahrenheit <=MAX_TEMP)) {
				totalFahrenheit += fahrenheit;
				validFahrenheits++;
			}
			else{System.out.println("Invalid value."); continue;}
		}
		if (validFahrenheits > 0) {
			System.out.println("Average Fahrenheit Temperature: " + totalFahrenheit/validFahrenheits);
		}

	}
}