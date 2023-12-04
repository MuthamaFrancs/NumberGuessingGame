import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int guess_no = 0;
        int random_no = 0;
        System.out.println("\n ************ HELLO lETS PLAY A GAME ********** \n");

        System.out.println("\t So, Here's the gist, You guess a number and if you get it right, You win Money 💸😂💸😂");

        Scanner in = new Scanner(System.in);
        

            System.out.print("\t Enter your guess number>>");
            try{
                guess_no = in.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input, retry!");
            }
                if (guess_no<random_no) {
                    System.out.println("The Number you entered is less than the actual number");
                    
                }
                else if(guess_no>random_no){
                    System.out.println("The Number you entered is greater than the actual number");
                   
                }
                else if (guess_no == random_no){

                }
                    
               
                    
            
               
            }        

    }
