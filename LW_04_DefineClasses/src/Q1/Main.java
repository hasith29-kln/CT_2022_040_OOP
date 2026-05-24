package Q1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Celsius Value: ");
        double celsius=scan.nextDouble();
        Temperature temp = new Temperature(celsius);
        System.out.println("Temperature in Fahrenheit: "+temp.toFahrenheit());

    }
}
