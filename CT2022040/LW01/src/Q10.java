import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Word Here:");
        String text = scan.nextLine();

        int mid = text.length() / 2;

        System.out.println(text.charAt(mid));
    }
}
