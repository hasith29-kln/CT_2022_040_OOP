package Q10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask user to enter a word
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Step 2: Create empty string for reversed word
        String reverse = "";

        // Step 3: Reverse the word using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Step 4: Compare original and reversed word
        if (word.equals(reverse)) {
            System.out.println("It is a palindrome word.");
        } else {
            System.out.println("It is not a palindrome word.");
        }
    }
}
