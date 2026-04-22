import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String fname = scann.next();
        System.out.println("Enter your Middle name:");
        String mname = scann.next();
        System.out.println("Enter Last name:");
        String lname = scann.next();
        System.out.println("Expected output is: "+fname+" "+mname.substring(0,1)+"."+" "+lname);
    }
}
