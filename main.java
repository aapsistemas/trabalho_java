import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        int thor_X =initialTx;
        int thor_Y = initialTy;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String direction = ""; 

            if(lightY < thor_Y){
                direction += "N";
                thor_Y --;
            }

            if(lightY > thor_Y){
                direction += "S";
                thor_Y ++;
            }


            if(lightX < thor_X){
                direction += "W";
                thor_X --;
            }

            if(lightX > thor_X){
                direction += "E";
                thor_X ++;
            }
          


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
