import java.util.Scanner; 
import java.io.*;

public class Battleship3 {

public static void main(String[] args) {

    System.out.println("Welcome to Battleship!");

    Scanner input = new Scanner(System.in);

    char [][] p1_board = new char [5][5]; char [][] p2_board = new char [5][5]; char [][] p1g1_board = new char [5][5]; char [][] p2g2_board = new char [5][5];
    
    int p1_ticker = 0; int p2_ticker = 0; 
    boolean alert; boolean game_in_play;


    // board dashes

    for (int i=0; i<5; i++){
        for(int j=0; j<5; j++){p1_board[i][j]='-'; p2_board[i][j]='-'; p1g1_board[i][j]='-'; p2g2_board[i][j]='-';}}
            
    int Num1 = 0; int Num2 = 0;
    

    //PLAYER 1 Board
    System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");
    for (int i=1; i<=5;i++){
        System.out.println("Enter ship "+i+" location:");
        alert=true;
        while(alert){
            if (input.hasNextInt())
                Num1 = input.nextInt();
            if (input.hasNextInt())
                Num2 = input.nextInt();
            if((Num1 >=5) ||( Num2 >=5) ){
                System.out.println("Invalid coordinates. Choose different coordinates.");
                System.out.println("Enter ship "+i+" location:");
            }else if(p1_board[Num1][Num2]=='@'){
                System.out.println("You already have a ship there. Choose different coordinates.");
                System.out.println("Enter ship "+i+" location:");}
                else{alert=false;}
        }

    p1_board[Num1][Num2]='@';

    }
    printBattleShip(p1_board);

    int x = 0;

    do{System.out.println(); x ++;} while (x<100);
    //PLAYER 2 Board
    System.out.println("PLAYER 2, ENTER YOUR SHIPS’ COORDINATES.");
    for (int i=1; i<=5;i++){
        System.out.println("Enter ship "+i+" location:");
        alert=true;
        while(alert){
            if (input.hasNextInt())
                Num1 = input.nextInt();
            if (input.hasNextInt())
                Num2 = input.nextInt();
            if((Num1 >=5) ||( Num2 >=5) ){
                System.out.println("Invalid coordinates. Choose different coordinates.");
                System.out.println("Enter ship "+i+" location:");
            }else if(p2_board[Num1][Num2]=='@'){
                System.out.println("You already have a ship there. Choose different coordinates.");
                System.out.println("Enter ship "+i+" location:");
            }else{
                alert=false;
            }
        }
        p2_board[Num1][Num2]='@';
    }



    printBattleShip(p2_board);
    int x2 = 0;
    do{System.out.println(); x2 ++;} while (x2<100);

    //Game
    game_in_play=true;
    while (game_in_play) {
        System.out.println("Player 1, enter hit row/column:");
        alert=true;
        while(alert) {
            if (input.hasNextInt()) {
                Num1 = input.nextInt();
            }
            if (input.hasNextInt()) {
                Num2 = input.nextInt();
                if ((Num1 >= 5) || (Num2 >= 5)) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    System.out.println("Player 1, enter hit row/column:");
                    alert = true;
                } else if (p1g1_board[Num1][Num2] == 'X' || p1g1_board[Num1][Num2] == '0') {
                    System.out.println("You already fired on this spot. Choose different coordinates.");
                    System.out.println("Player 1, enter hit row/column:");
                    alert = true;
                } else {
                    if (p2_board[Num1][Num2] == '@') {
                        System.out.println("PLAYER 1 HIT PLAYER 2’s SHIP!");
                        p1g1_board[Num1][Num2] = 'X';
                        p1_ticker++;
                        alert = false;
                    } else {
                        System.out.println("PLAYER 1 MISSED!");
                        p1g1_board[Num1][Num2] = 'O';
                        alert = false;

                    }
                }
            }
        }


        if (p1_ticker==5){

            alert=false; game_in_play = false;
            
            System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
            System.out.println("Final boards:");
            System.out.println();
            /////
            for (int row = 0; row < 5; row++) {
                 for (int column = 0; column < 5; column++) {
                     if ((p1_board[row][column] =='@')&&(p2g2_board[row][column]=='-')){
                         p2g2_board[row][column] ='@';}}}
            /////
            printBattleShip(p2g2_board); System.out.println(); printBattleShip(p1g1_board);} 

        else if ((p1_ticker<5) && (p2_ticker<5)){
            printBattleShip(p1g1_board);
            System.out.println();
            System.out.println("Player 2, enter hit row/column:");
            alert = true;}

        while(alert) {
            if (input.hasNextInt())
                Num1 = input.nextInt();
            if (input.hasNextInt()) {
                Num2 = input.nextInt();
                if ((Num1 >= 5) || (Num2 >= 5)) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    System.out.println("Player 2, enter hit row/column:");
                    alert = true;}
                else if (p2g2_board[Num1][Num2] == 'X' || p2g2_board[Num1][Num2] == '0') {
                    System.out.println("You already fired on this spot. Choose different coordinates.");
                    System.out.println("Player 2, enter hit row/column:");
                    alert = true;}
                else if (p1_board[Num1][Num2] == '@') {
                    System.out.println("PLAYER 2 HIT PLAYER 1’s SHIP!");
                    p2g2_board[Num1][Num2] = 'X';
                    p2_ticker++;
                    alert = false;}
                else {
                    System.out.println("PLAYER 2 MISSED!");
                    p2g2_board[Num1][Num2] = 'O';
                    alert = false;}
            }
        }

        if (p2_ticker==5){
            alert=false;
            game_in_play = false;
            System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
            System.out.println("Final boards:");
            System.out.println();
            printBattleShip(p2g2_board);
            System.out.println();
            /////
            for (int row = 0; row < 5; row++) {
                for (int column = 0; column < 5; column++) {
                    if ((p2_board[row][column] =='@')&&(p1g1_board[row][column]=='-')){
                        p1g1_board[row][column] ='@';}
                }
            }
            printBattleShip(p1g1_board);}

        else if ((p1_ticker<5) && (p2_ticker<5)){
            printBattleShip(p2g2_board);
            System.out.println();
            //System.out.println("Player 1, enter hit row/column:");
            alert = true;}
    }
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