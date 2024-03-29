import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        playNumberGame();
    }
    public static void playNumberGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5; // Set the maximum number of attempts

        System.out.println("Welcome to the NumberGame!");
        System.out.println("Guess a number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts+1) + " - Enter the guessed number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have reached the maximum number of attempts. The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}