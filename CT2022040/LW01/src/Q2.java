import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner my = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String fname = my.next();
        System.out.println("Enter your Last name:");
        String lname = my.next();
        //String fullname = fname+" "+lname;
        JFrame myWindow = new JFrame(fname+" "+lname);
        myWindow.setSize(800,600);
        myWindow.setVisible(true);


    }
}
