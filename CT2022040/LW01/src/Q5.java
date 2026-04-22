import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(today));
    }
}
