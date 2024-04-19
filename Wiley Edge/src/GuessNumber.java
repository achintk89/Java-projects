import java.util.*;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random randomNum = new Random();
        int mysno = randomNum. nextInt(100)+1;
        System.out.println("Welcome to the Mysterious Number Guesser!");
        System.out.println("I have selected a number between 1 to 100 can you guess it.");

        while(true) {
            System.out.println("Enter your guess: ");
            int userno = s.nextInt();
            int diff = Math.abs(userno-mysno);
            if (diff >= 10)
                System.out.println("You are getting far!");
            else if (diff == 0){
                System.out.println("Congratulations your guess is right!");
            }
            else
            {
                System.out.println("You are getting closer!");
            }
        }

    }

}
