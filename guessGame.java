import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class guessGame {
    private int guess_no = 0 ;
    //declaring the range of the random number to be generated btwn 1 and 10;
    private int no_of_guesses;
    private int min = 1;
    private int max = 10 ;
    private int range = max - min + 1;
    private int random_no= (int)(Math.random() *range ) + min;
    private int awards = (int)(Math.random()* range * 5);
    
    Scanner in = new Scanner(System.in);
    JOptionPane input = new JOptionPane();

    guessGame(){
        
    }

    public void guessingGame(){
  
        for(no_of_guesses=1;no_of_guesses<4 ;no_of_guesses++){

            //String guessnoString = JOptionPane.showInputDialog(input, "Enter your guess number ", "NUMBER GUESSING GAME ", JOptionPane.INFORMATION_MESSAGE);
            System.out.print("\n \t Enter your guess number >> ");
            try{
                //guess_no = Double.parseDouble(guessnoString);
                guess_no = in.nextInt();
            
                if(guess_no<random_no){
                //implement GUI
                System.out.println("\n \t Oops! The number you entered is less than the Actual Number. TRY AGAIN \n");
                System.out.println("\t Number of trials :" + no_of_guesses);
                //System.out.println(" \t Number of trials :"+ no_of_guesses);

                }
                else if(guess_no>random_no){
                    System.out.println("\n \t Gotcha! The number you entered is more than the Actual Number. TRY AGAIN \n");
                    System.out.println(" \t Number of trials :"+ no_of_guesses);
                }
                else if (guess_no == random_no){
                    
                    System.out.println("\n  \t CONGRATULATIONS YOUR GUESS IS RIGHT!. NO OF TRIALS IS : "+ no_of_guesses +"   \tSUCH A GOOD GUESSER YOU WIN $" + awards +"\n");
                    if (no_of_guesses<4) {
                        break;
                    }
                    // this break statement is responsible for situations where the user enters the correct guess at first attempt
                }
                else{
                    
                    System.out.println("You have reached maximum number of attempts");
                }
                }
            catch(InputMismatchException e){
            System.out.println("\t Invalid input, retry! \n");
            }
            
        }
        
        if (no_of_guesses > 3) {
            System.out.println("\n You have reached the maximum number of attempts. The correct number was: " + random_no);
        }
        
    }
}
 