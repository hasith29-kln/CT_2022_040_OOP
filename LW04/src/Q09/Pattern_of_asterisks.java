package Q09;

import java.util.Scanner;

public class Pattern_of_asterisks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

        }
    }
}
