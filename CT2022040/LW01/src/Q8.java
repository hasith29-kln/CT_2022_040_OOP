import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Sentence:");
        String sentence = scan.nextLine();
        int index = sentence.indexOf("!");

        String p1 = sentence.substring(0,index);
        String p2 = sentence.substring(index+1);

        System.out.println(p1.trim());
        System.out.println(p2.trim());

    }
}
