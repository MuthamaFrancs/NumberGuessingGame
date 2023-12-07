import java.util.InputMismatchException;
import java.util.Scanner;


///sdsd

public class Main {

    public static void main(String[] args) {
        int guess_no = 0 ;
        //declaring the range of the random number to be generated
        int min = 1;
        int max = 10 ;
        int range = max - min + 1;
        int random_no= (int)(Math.random() *range ) + min;
        

        System.out.println("\n *********************************** HELLO lETS PLAY A GAME **************************** \n");

        
        System.out.println("\t So, Here's the gist, You guess a number and if you get it right, You get to win Money 💸😂💸😂");

        Scanner in = new Scanner(System.in);
        
        do{
        System.out.print("\n \t Enter your guess number >> ");
          
            try{
                guess_no = in.nextInt();
                if(guess_no<random_no){
                //implement GUI
                System.out.println("\t Oops! The number you entered is less than the Actual Number. TRY AGAIN");
                }
                else if(guess_no>random_no){
                    System.out.println("\t Gotcha! The number you entered is more than the Actual Number. TRY AGAIN");
                }
                else if (guess_no == random_no){
                    System.out.println("\t CONGRATULATIONS MY FRIEND. \n \tSUCH A GOOD GUESSER YOU WIN $240");
                }
                }
            catch(InputMismatchException e){
            System.out.println("\t Invalid input, retry!");
            }
            
        }  while(guess_no != random_no); 
    }

}
