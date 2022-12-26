import java.util.*;
import java.io.*;
import java.lang.*;

public class Practice{

	public static void main(String[] Args) {

		System.out.println("Welcome to Battleship!");

		String player1, player2;

		getCoordinates(choosePlayer(1));
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

		return gameBoard;

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
	private static int[][] getCoordinates(int val) {

				Scanner input = new Scanner(System.in);

				int row, col, counter;
				int boardLength = 5;
				int maxPlayers = 2;
				int coordinatesLength = 10;
				int[][] player1Coordinates = new int[5][2];
				int[][] player2Coordinates = new int[5][2];

						while (val == 1) {
							for (col = 1; col < maxPlayers; col++ ) {

							System.out.println("Player " + val + ", ENTER YOUR SHIPS’ COORDINATES.");
									
								for (row = 1; row <  coordinatesLength + 1; row++) {

									System.out.println("Enter ship " + row + " location: ");
										
									try{
										int coordinate = input.nextInt();
										player1Coordinates[1][row] = coordinate;
										// player2Coordinates[2][row] = coordinate;
									} 
									catch(Exception e) {System.out.println("Invalid coordinates. Choose different coordinates.");}

								}
									
							}
					
						val++;
						// return player1Coordinates;
						}

						while (val == 2){

							for (col = 2; col < maxPlayers; col++ ) {

							System.out.println("Player " + val + ", ENTER YOUR SHIPS’ COORDINATES.");
									
								for (row = 1; row <  coordinatesLength + 1; row++) {

									System.out.println("Enter ship " + row + " location: ");
										
									try{
										int coordinate = input.nextInt();
										// player1Coordinates[1][row] = coordinate;
										player2Coordinates[2][row] = coordinate;
									} 
									catch(Exception e) {System.out.println("Invalid coordinates. Choose different coordinates.");}

								}
									
							}

						val++;
						}	
			// return player2Coordinates;

			if (val == 1) {return player1Coordinates;} else {return player2Coordinates;}			
		}	
}