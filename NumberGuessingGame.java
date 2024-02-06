import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1; // Minimum value of the range
        int maxRange = 100; // Maximum value of the range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange; // Generate random number
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        int guess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
