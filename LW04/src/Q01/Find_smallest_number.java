package Q01;

import java.util.Scanner;

public class Find_smallest_number {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        x=scan.nextInt();
        System.out.println("Enter 2nd Number:");
        y=scan.nextInt();
        System.out.println("Enter 3rd Number:");
        z=scan.nextInt();
        if(x<y){
            System.out.println("Smallest Number is:"+x);
        }else if(y<z){
            System.out.println("Smallest Number is:"+y);
        }else if(x>z){
            System.out.println("Smallest Number is:"+z);
        }

    }
}
