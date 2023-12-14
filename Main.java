//import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n         \n                                          GUESSING GAME                                            \n");
        System.out.println("So, Here's the gist, You Guess a number and if you get it right, You get to win Money 💸💸😂    You heve upto 3 trials  ");
        Scanner in = new Scanner(System.in);
        guessGame game1 = new guessGame();
        game1.guessingGame();
       
        
        
        
        int i = 0;
        do {
            System.out.print("\n to Continue playing? Enter 1 :");
            System.out.println("\t to Quit Enter 0");
            int choice=in.nextInt();
            switch (choice) {
            case 1 :
                game1.guessingGame();
                break;
            case 0 :
                System.out.println("                                   BYE                                   \n");
                System.exit(0);
            default:
                break;
        }
        }
        while(i<1);
        
        in.close();
    }

}
