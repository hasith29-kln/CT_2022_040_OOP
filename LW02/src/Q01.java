import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Part a
        double A,B,C,Value;
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter value A:");
        A=scan1.nextDouble();
        System.out.println("Enter value B:");
        B=scan1.nextDouble();
        System.out.println("Enter value C:");
        C=scan1.nextDouble();
        Value = Math.sqrt(B*B+4*A*C);
        System.out.println("Final Output is:"+Value);

        //Part b
        double X,Y,Output1,Output2;
        Scanner scan2=new Scanner(System.in);
        scan2.nextLine();
        System.out.println("Enter Value X:");
        X=scan2.nextDouble();
        System.out.println("Enter Value Y:");
        Y=scan2.nextDouble();
        Output1=Math.sqrt(X+4*Math.pow(Y,3));
        System.out.println("Final Output1 is:"+Output1);

        //Part c
        Output2=Math.cbrt(X*Y);
        System.out.println("Final Output2 is:"+Output2);

        //Part d
        double r,Area;
        Scanner scan3=new Scanner(System.in);
        scan3.nextLine();
        System.out.println("Enter the Radius of the Circle:");
        r= scan3.nextDouble();
        Area=Math.PI*r*r;
        System.out.println("Area is:"+Area);


    }

}
