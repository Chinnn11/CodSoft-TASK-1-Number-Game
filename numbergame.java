import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("\n----------------------Welcome to the Number Guessing Game!----------------------");
        System.out.println("\n All you need to do is guess a number between 1 to 100.");
        System.out.println("\n Lets begin the Game and GOOD LUCK.\n");

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Guess: ");
        
        while (true) {
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                System.out.println("Thanks for playing. Have a good day!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Number is Too low! Try again.");
            } else {
                System.out.println("Number is Too high! Try again.");
            }
        }
        
        scanner.close();
        System.out.println("Number Guessing Game has been terminated");
    }
}