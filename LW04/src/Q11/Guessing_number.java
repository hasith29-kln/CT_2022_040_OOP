package Q11;

import java.util.Scanner;

public class Guessing_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Generate random number
        int number = (int) (Math.random() * 100) + 1;

        int guess = 0;

        // Step 2: Repeat until correct guess
        while (guess != number) {

            // Ask user to enter guess
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();

            // Step 3: Check guess
            if (guess < number) {
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }
    }
}
