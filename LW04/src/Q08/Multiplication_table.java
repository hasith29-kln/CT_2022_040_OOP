package Q08;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        num=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
