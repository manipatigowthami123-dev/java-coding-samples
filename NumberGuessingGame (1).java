import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=====================================");
        System.out.println("      WELCOME TO NUMBER GUESSING     ");
        System.out.println("=====================================");
        System.out.println("Try to guess the number between 1 and 100!");
        System.out.println("Type 0 anytime to quit.");
        System.out.println("=====================================");

        int target = rand.nextInt(100) + 1;
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == 0) {
                System.out.println("You exited the game. Better luck next time!");
                break;
            }

            if (guess > target) {
                System.out.println("Too high! Try a smaller number.");
            } else if (guess < target) {
                System.out.println("Too low! Try a bigger number.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it right!");
                System.out.println("Total Attempts: " + attempts);
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}