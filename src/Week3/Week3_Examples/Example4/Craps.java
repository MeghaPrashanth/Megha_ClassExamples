package Week3.Week3_Examples.Example4;

import java.security.SecureRandom;

public class Craps {

    //Create the random number generator
    private static final SecureRandom randomNumber = new SecureRandom();

    //Create an enum for game states

    private enum Status {
      WON, LOST, CONTINUE

    };

    //Static variables

    private static final int SNAKE_EYES = 2;
    private static  final int TREY = 3;
    private static  final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {


    }
}
