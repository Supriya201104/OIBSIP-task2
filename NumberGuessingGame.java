import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int generatedNumber, userGuess, attempts = 0, maxAttempts = 10, score = 1000;
        boolean hasGuessed = false;
        generatedNumber = random.nextInt(101);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess my number between 1 and 100");
        while (attempts < maxAttempts && !hasGuessed) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == generatedNumber) {
                hasGuessed = true;
                System.out.println("Yahoooooo...!! You guessed the number in " + attempts + " attempts.");
            } else if (userGuess > generatedNumber) {
                System.out.println("That was too High! Try again.");
            } else {
                System.out.println("That was too Low! Try again.");
            }
        }
        if (!hasGuessed) {
            System.out.println("Sorry, you've used all attempts. The correct number was: " + generatedNumber);
        } else {
            score = score - (attempts * 100);
            System.out.println("Your score: " + score);
        }

        scanner.close();
    }
}
