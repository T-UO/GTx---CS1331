import java.util.Scanner; import java.io.*;

public class Practice { 
    public static void main(String []Args){
                
                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to Battleship!");
                System.out.println();
                
                // battleship location
                int[][] ship1_loc, ship2_loc, ship3_loc, ship4_loc, ship5_loc;

                validateInput();
            


    }

// A static method is a method that belongs to a class, but it does not belong to an instance of that class
// and this method can be called without the instance or object of that class.
// In the static method, the method can only access only static data members and static methods of another 
// class or same class but cannot access non-static methods and variables.

public static void validateInput(){

    Scanner input = new Scanner(System.in);

    boolean alert = false;

    int[][] p1_ship = new int[5][2];
    int[][] p2_ship = new int[5][2];

    for (int col = 0; col < p1_ship[0].length; col++) {
        
        
        System.out.println("Player " + (col+1) + ", ENTER YOUR SHIPS’ COORDINATES.");
         // row coordinates for Player1
        int[] ship1_row = new int[5]; 
        // col coordinates for Player1
        int[] ship1_col = new int[5];
        
        int counter = 0;
        do{ 
            for(int row = 0; row < p1_ship.length; row++){
            System.out.println("Enter ship " + (counter+1) + " location: ");  
            counter++;  
            
                    
                    

            try{ ship1_row[row] = input.nextInt(); ship1_col[col] = input.nextInt(); } 
            catch(Exception e) 
            { 
                System.out.println("Invalid coordinates. Choose different coordinates."); 
                System.out.println();
                System.out.println("Enter ship " + (counter+1) + " location: ");
                ship1_row[row] = input.nextInt(); ship1_col[col] = input.nextInt();
            }


                }

            counter++;

            }

        while (counter < p1_ship.length); 

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




        //         double[][] array2d = {{80,75,70}, {69,72,74}};
        //      for (int col = 0; col < array2d[0].length; col++) {
        //     for (int row = 0; row < array2d.length; row++) {
                
        //             System.out.println(array2d[col][row]);
                
        //     }
        // }