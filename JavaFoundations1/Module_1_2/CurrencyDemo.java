import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyDemo{
	public static void main(String[] Args){
		int items;
		double itemCost, total;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		items = input.nextInt();
		System.out.print("Enter the cost per item: ");
		itemCost = input.nextDouble();
		total = items * itemCost;
		System.out.println();
		System.out.println("Unformatted Total: " + total);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // don't always use new operator to instantiate new objects; Some classes have methods that return new instances of themselves where the instances are customized in certain ways
		System.out.println("Formatted Total: " + currencyFormat.format(total));

	}
}