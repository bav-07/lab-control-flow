import java.lang.Math;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Generate a random number between 1 and 100
        int randomNumber = (int)(Math.random()*100)+1;

        // Initially ask user
        System.out.println("Guess the secret number, between 1 and 100: ");
        Scanner reader = new Scanner(System.in);
        int userGuess = reader.nextInt();

        // If the user guesses right first turn (lucky)
        if (userGuess == randomNumber) {
            System.out.println("You got it right first try! The secret number was " + randomNumber + ".");
        }
        else if (userGuess > randomNumber) {
            System.out.println("Too high, try again: ");
        }
        else {
            System.out.println("Too low, try again: ");
        }

        // while the number the user guesses is not the random number
        // keep asking the user for their guess
        // if they guess correctly, display the success message and end
        // if they guess wrong, let them know whether their guess was too high
        while (userGuess != randomNumber) {
            userGuess = reader.nextInt();
            if (userGuess > randomNumber) {
                System.out.println("Too high, try again: ");
            }
            else if (userGuess < randomNumber) {
                System.out.println("Too low, try again: ");
            }
            else {
                System.out.println("Correct! The secret number was " + randomNumber + ".");
            }
        }
    }
}

