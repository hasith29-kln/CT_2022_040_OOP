package Q2;

import Q1.Temperature;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter fahrenheit Value: ");
        double fahrenheit=scan.nextDouble();
        Q1.Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheit);
        System.out.println("Temperature in Celsius: "+temp.toCelsius());
    }
}
