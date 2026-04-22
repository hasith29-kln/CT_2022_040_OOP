import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setVisible(true);
        frame.setTitle(time.format(format));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
