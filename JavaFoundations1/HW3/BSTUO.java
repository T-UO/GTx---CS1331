import java.util.*;
import java.io.*;
import java.lang.*;

public class BSTUO{

	public static void main(String[] Args) {

		System.out.println("Welcome to Battleship!");

		String player1, player2;

		// getCoordinates();
	}

	private static char[][] createGameBoard(int[][] playerCoordinates, int gameBoardLength) {

		char water = '-';
		char notHit = '@';
		char hit = 'X';
		char miss = 'O';
		char[][] gameBoard = new char[gameBoardLength][gameBoardLength];

		for(int row = 0; row < gameBoardLength; row++) {

			for(int col = 1; col < gameBoardLength; col++) {

				gameBoard[row][col] = water;  // default setting to have gameboard filled out with water

			}
		}

		

	}

	private static int choosePlayer(int playerNumber) {

		Scanner input = new Scanner(System.in);
		System.out.print("Player: ");
		playerNumber = input.nextInt(); // used to identify the player
		int val = 0;
		if (playerNumber == 1) {val = 1;}
		if (playerNumber ==2) {val = 2;}

	return val;
	}

	// need to add a return function so that this is usable
	private static char[] getCoordinates(int val) {

		
				Scanner input = new Scanner(System.in);

				int row, counter;
				int boardLength = 5;
				int maxPlayers = 2;
								

				if (val == 1 || val == 2) {
				for (counter = 1; counter < maxPlayers + 1; counter++ ) {

					

					System.out.println("Player " + val + ", ENTER YOUR SHIPS’ COORDINATES.");
						
						
						for(row = 1; row < boardLength + 1; row++) {
							
							if (input.hasNextInt()) {
								System.out.println("Enter ship " + row + " location: ");
								char firstCoordinate = input.next().charAt(0);
								char secondCoordinate = input.next().charAt(0);
								// char[][] player = {firstCoordinate, secondCoordinate};
								// char[][] player = new char[boardLength][boardLength];
								char[][] playerCoordinates = new char[boardLength][boardLength];
								playerCoordinates[counter][row] = {{firstCoordinate}, {secondCoordinate}};

								// player[counter][row] = [{firstCoordinate}, {secondCoordinate}];
								// player[counter] = playerCoordinates[firstCoordinate][secondCoordinate]; 
							}
		
							else {System.out.print("Invalid coordinates. Choose different coordinates.");}
							// while (val == 1 && counter == 1) {return player[1];}
							// while (val == 2 && counter == 2) {return player[2];}
		
						}	// end of second for loop		

								return player;

				}		// end of first for loop

					
			}			// end of conditional val statement before for loop

		else {System.out.println("Player number must be 1 or 2");}

		}
}