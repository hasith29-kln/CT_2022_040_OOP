package Q04;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year:");
        year= scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This is Leap Year!...");
        }else{
            System.out.println("Not a Leap year!...");
        }
    }
}
