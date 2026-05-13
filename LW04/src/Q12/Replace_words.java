package Q12;

import java.util.Scanner;

public class Replace_words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Get word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        // Get replacement word
        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        // Replace words
        String result = sentence.replace(oldWord, newWord);

        // Display result
        System.out.println("New sentence:");
        System.out.println(result);
    }
}
