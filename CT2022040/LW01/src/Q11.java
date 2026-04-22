import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Full name:");
        String first = scan.next();
        String mname = scan.next();
        String lname = scan.next();
        System.out.println(lname+", "+first+" "+mname.charAt(0)+".");
    }
}

