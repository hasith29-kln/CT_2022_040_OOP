import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scan.nextLine();

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
    }
}
