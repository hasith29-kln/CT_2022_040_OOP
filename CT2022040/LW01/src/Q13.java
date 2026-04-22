import javax.swing.*;

public class Q13 {
    public static void main(String[] args) {
        JFrame mywindow;
        mywindow = new JFrame();
        mywindow.setSize(500,200);
        mywindow.setTitle("UOK");
        mywindow.setVisible(true);
        try {Thread.sleep(500);} catch (Exception e) { }
        mywindow.setVisible(false);
        try {Thread.sleep(500);} catch (Exception e) { }
        mywindow.setVisible(true);

    }
}
