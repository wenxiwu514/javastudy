package acwing;
import java.util.Scanner;
public class ac660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = {0.0, 4.0, 4.5, 5.0, 2.0, 1.5};
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = c * a[b];
        System.out.println("Total: R$ "+String.format("%.2f", d));
    }
}
