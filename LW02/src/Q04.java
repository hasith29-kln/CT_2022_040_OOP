import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        double c,bW;  //c=Calories,bW=Body Weight
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please Enter your Body weight:");
        bW= scan.nextDouble();
        c=bW*19;
        System.out.println("What amount of the calories,Do you need in One Day:"+c+"Calories");

    }
}
