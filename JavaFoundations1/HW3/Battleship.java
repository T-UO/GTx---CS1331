import java.util.Scanner; import java.io.*;

public class Battleship { 



public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Battleship!");

    int ship1 = 5; int ship2 = 5;

    int players = 2; int player = 1; 
    int ship_total = 5;
    

    char[][] p1_Board = new char[5][5]; char[][] p1_Status = new char[5][5]; char[][] p2_Board = new char[5][5]; char[][] p2_Status = new char[5][5];
    

    // default placeholders "-"
    for (int row = 0; row < 5; row++) {
        for (int column = 0; column < 5; column++) {
            p1_Board[row][column] = 45; 
            p1_Status[row][column] = 45;
            p2_Board[row][column] = 45;
            p2_Status[row][column] = 45;
        }

    }

   // Create Board
    do {
        if (player == 1) {
            p1_Board = board_design(p1_Board, player, ship_total, input);
            Battleship.printBattleShip(p1_Board);
            // comment out the below for loop when testing
            for (int counter = 1; counter < 100; counter++) {
            System.out.println("");
            }
        } else {
            p2_Board = board_design(p2_Board, player, ship_total, input);
            Battleship.printBattleShip(p2_Board);

            // comment out the below for loop when testing
            for (int counter = 1; counter <= 100; counter++) {
            System.out.println("");
            }
        }

        player += 1;

    } while (player == players);

    //game start

    int offense = 1; int defense = 2;
    while (ship1 > 0 && ship2 > 0) {
        if (offense == 1) {p2_Board = game(p2_Status, p2_Board, offense, defense, input);} 
        else {p1_Board = game(p1_Status, p1_Board, offense, defense, input);}
        int test = offense; offense = defense; defense = test;}

    if (ship1 == 0) {System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S ship_total!");}
    else if (ship2 == 0) {System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S ship_total!");}

    System.out.println("Final boards:");
    printBattleShip(p1_Board);
    // System.out.println("");
    printBattleShip(p2_Board);

}

public static char[][] game(char[][] board, char[][] template, int offense, int defense, Scanner input) {
    System.out.println("Player " + offense + " enter hit row/column:");
    int x = input.nextInt();
    int y = input.nextInt();
    
     int ship1 = 5; int ship2 = 5;

    while (invalidCoordinates(x, y) || identical(board[x][y], (char) 79) ||
            identical(board[x][y], (char) 88)) {
        if (invalidCoordinates(x, y)) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        } else {
            System.out.println("You already fired on this spot. Choose different coordinates.");
        }

        System.out.println("Player " + offense + " enter hit row/column:");
        x = input.nextInt();
        y = input.nextInt();
    }

    if (template[x][y] == 64) {
        board[x][y] = 88;
        template[x][y] = 88;
        System.out.println("PLAYER " + offense + " HIT PLAYER " + defense + "'S SHIP!");
        printBattleShip(board);
        if (offense == 1) {ship2 -= 1;} 
        else {ship1 -= 1;}} 

        else {
        board[x][y] = 79;
        template[x][y] = 79;
        System.out.println("PLAYER " + offense + " MISSED!");
        printBattleShip(board);
    }

    return template;
}

public static char[][] board_design(char[][] board, int player, int ship_total, Scanner input) {
    System.out.println("PLAYER " + player + " ENTER Ship COORDINATES.");
    for (int ship = 1; ship <= ship_total; ship++) {
        System.out.println("Enter ship " + ship + " location:");
        int x, y; x = input.nextInt();y = input.nextInt();
        // If coordinates are out of bounds or invalid

        // If ship is already present there
        while (invalidCoordinates(x, y) || identical(board[x][y], (char) 64)) {
            if (invalidCoordinates(x, y)) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
            } else {
                System.out.println("You already have a ship there. Choose different coordinates.");
            }

            System.out.println("Enter ship " + ship + " location:");
            x = input.nextInt(); y = input.nextInt();
        }

        board[x][y] = 64;

    }
    return board;
}

public static boolean invalidCoordinates(int x, int y) {
    if (x < 0 || x > 4 || y < 0 || y > 4) {
        return true;
    }
    return false;
}

public static boolean identical(char x, char y) {
    if (x == y) {
        return true;
    }
    return false;
}

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
