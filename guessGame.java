import java.util.InputMismatchException;
import java.util.Scanner;

public class guessGame {
    private int guess_no = 0 ;
    //declaring the range of the random number to be generated btwn 1 and 10;
    private int no_of_guesses;
    private int min = 1;
    private int max = 10 ;
    private int range = max - min + 1;
    private int random_no= (int)(Math.random() *range ) + min;
    Scanner in = new Scanner(System.in);

    guessGame(){
        
    }

    public void guessingGame(){
  
        for(no_of_guesses=1;no_of_guesses<4 ;no_of_guesses++){

            System.out.print("\n \t Enter your guess number >> ");
            try{
                guess_no = in.nextInt();
            
                if(guess_no<random_no){
                //implement GUI
                System.out.println("\n \t Oops! The number you entered is less than the Actual Number. TRY AGAIN \n");
                System.out.println(" \t Number of trials :"+ no_of_guesses);
                }
                else if(guess_no>random_no){
                    System.out.println("\n \t Gotcha! The number you entered is more than the Actual Number. TRY AGAIN \n");
                    System.out.println(" \t Number of trials :"+ no_of_guesses);
                }
                else if (guess_no == random_no){
                    System.out.println(" \t Number of trials :"+ no_of_guesses);
                    System.out.println("\n  \t CONGRATULATIONS MY FRIEND.  \tSUCH A GOOD GUESSER YOU WIN $240\n");
                    
                }
                
                }
            catch(InputMismatchException e){
            System.out.println("\t Invalid input, retry! \n");
            }
        }
  
    }
}
 