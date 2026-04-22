import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Q4 {
    public static void main(String[] args) {

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
        /*GregorianCalendar mycalendar = new GregorianCalendar();
        mycalendar.set(2026,3,21);
        System.out.println(mycalendar.get(Calendar.YEAR));*/
    }
}
