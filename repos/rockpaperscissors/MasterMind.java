import java.util.Random;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
        // Initialization of game variables
        int turn = 0;   // number of game turns
        String randSequence = generateHiddenSequence(); // generating the secret sequence the use must guess
        String row = "";    // starting the user guessing spot 
        do {
            row = getUserGuess();
        } while (gameIsOn(row, randSequence, turn));
        print(randSequence);
        print(row);
    }
    
    private static boolean gameIsOn(String row, String randSequence, int turn) {
        return true;
    }

    private static String getUserGuess() {
        Scanner k = new Scanner(System.in);
        String userRow;
        print("Make your guess:");
        userRow = k.next();
        return userRow;
    }


    private static void print(String s) {
        System.out.print(s);
    }


    private static String generateHiddenSequence() {
        Random r = new Random();
        String randSeq = "";
        String options = "abcdef";
        for(int i=0; i<4; i++) {
            randSeq = randSeq + options.charAt(r.nextInt(options.length()));
        }
        return randSeq;
    }
    
}