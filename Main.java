//import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n                                            GUESSING GAME                                            \n");
        System.out.println("\t So, Here's the gist, You Enter a number and if you get it right, You get to win Money 💸💸😂");
        Scanner in = new Scanner(System.in);
        guessGame game1 = new guessGame();
        game1.guessingGame();
        System.out.println("\n \t You have reached maximum number of trials!");
        System.out.print("\t to Continue playing? Enter 1 :");
        System.out.print("\t to Quit Enter 0");
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
        in.close();
    }

}
