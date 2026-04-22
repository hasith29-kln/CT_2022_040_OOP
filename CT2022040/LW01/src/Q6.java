import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Width:");
        int w = ss.nextInt();
        System.out.println("Enter Height:");
        int h = ss.nextInt();
        ss.nextLine();

        System.out.println("Enter the Title:");
        String title = ss.nextLine();

        JFrame frame = new JFrame();
        frame.setSize(w,h);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
