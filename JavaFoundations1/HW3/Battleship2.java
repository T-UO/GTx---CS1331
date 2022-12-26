import java.util.*;
import java.io.*;

public class Battleship2 {
	public static void main(String[] args) {

		int p1c1, p1c2, p2c1, p2c2, p3c1, p3c2, p4c1, p4c2, p5c1, p5c2;
		p1c1 = p1c2 = p2c1 = p2c2 = p3c1 = p3c2 = p4c1 = p4c2 = p5c1 = p5c2 = 0;
		
		// ship coordinates
		int[] ship1 = {p1c1, p1c2}; int[] ship2 = {p2c1, p2c2}; int[] ship3 = {p3c1, p3c2}; int[] ship4 = {p4c1, p4c2}; int[] ship5 = {p5c1, p5c2};

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Battleship!");
		System.out.println();

		
		try {

			// Ship1 coordinates
			System.out.println("Player 1, ENTER YOUR SHIP'S COORDINATES.");
			System.out.println("Enter ship 1 location:"); p1c1 = input.nextInt(); p1c2 = input.nextInt();

			// Ship2 coordinates
			System.out.println("Enter ship 2 location:");
			p2c1 = input.nextInt(); p2c2 = input.nextInt();
			if (ship2.equals(ship1)) {System.out.print("You already have a ship there. Choose different coordinates."); return;}

			// Ship3 coordinates
			System.out.println("Enter ship 3 location:");
			p3c1 = input.nextInt(); p3c2 = input.nextInt();
			if (ship3.equals(ship2) || ship3.equals(ship1)) {System.out.print("You already have a ship there. Choose different coordinates."); return;}

			// Ship4 coordinates
			System.out.println("Enter ship 4 location:");
			p4c1 = input.nextInt(); p4c2 = input.nextInt();
			if (ship4.equals(ship3) || ship4.equals(ship2) || ship4.equals(ship1)) {System.out.print("You already have a ship there. Choose different coordinates."); return;}

			// Ship5 coordinates
			System.out.println("Enter ship 5 location:");	
			p5c1 = input.nextInt(); p5c2 = input.nextInt();if (ship5.equals(ship4) || ship5.equals(ship3) || ship5.equals(ship2) || ship5.equals(ship1)) {System.out.print("You already have a ship there. Choose different coordinates.");}
			return;

		} 
		catch(Exception e) {System.out.print("Invalid coordinates. Choose different coordinates.");}
		



    
   } // end of main argument

    // Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}

}