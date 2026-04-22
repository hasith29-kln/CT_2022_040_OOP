import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main() {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(today));
        /*int n1=89;
        int n2=56;
        System.out.println("Sum is:"+(n1+n2));
        System.out.println(n1+"0"+n2);*/
        /*System.out.println("Shopping List:\n\t\t\tBanana\n\t\t\tApple\n\t\t\tLow-fat milk");
        String country ="Sri Lanka";
        System.out.println("I love "+country);
        System.out.println(country.indexOf("a"));
        System.out.println(country.substring(0,5));//5 means the limit of the string
        System.out.println("Length of the string:"+country.length());
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your name:");
       // String name = scanner.next();
        //System.out.println("Hi "+name);
        //System.out.println("Enter your Age:");
        //int age = scanner.nextInt();//integer data type we use nextTnt
        //System.out.println("Age is:"+age);
        System.out.println("Enter your First name:");
        String fname = scanner.next();
        System.out.println("Enter your Middle name:");
        String mname = scanner.next();
        System.out.println("Enter Last name:");
        String lname = scanner.next();
        System.out.println("Your Full name With Initials is: "+fname.substring(0,1)+"."+mname.substring(0,1)+"."+lname);*/
    }
}
