import java.util.Random;
import java.util.Scanner;

public class NumberGame{
       public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        Random rd=new Random();
        int totalattempts=0;
        int rounds=0;
        int roundswon=0;
        char playagain;
        

        System.out.println("NUMBER GAME!");
        do{
            int numtoguess=rd.nextInt(100)+1;
            int attempts=0;
            int maxattempts=5;
            boolean correctguess=false;
            System.out.println("Guess a number between 1 to 100!");

            while(attempts<maxattempts){
                int guess=scanner.nextInt();
                attempts++;

                if(guess==numtoguess){
                    System.out.println("Correctly Guessed in " + attempts +"attempts");
                    correctguess=true;
                    roundswon++;
                    totalattempts=totalattempts +attempts;
                    break;
                }else if(guess<numtoguess){
                    System.out.println("Guess is too low.Try Again:");
                }else{
                    System.out.println("Guess is too high.Try Again:");
                }
            }
            if(!correctguess){
                System.out.println("You have used all attempts.The number was " + numtoguess+".");
            }

            System.out.println("Do you want to play again? (y/n):");
            rounds++;
            playagain=scanner.next().charAt(0);    
        }while(playagain=='y'||playagain=='Y');
        System.out.println("Rounds Won:"+ roundswon+ " out of " + rounds);
        
        System.out.println("Thanks for playing!!!");
        scanner.close();
    }

}


       
                 

          
 