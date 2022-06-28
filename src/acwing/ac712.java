package acwing;
import java.util.Scanner;
public class ac712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for(int i = 1; i <= 6; i ++){
            double b = sc.nextDouble();
            if(b > 0) {a ++;}
        }
        System.out.println(a +" positive numbers");
    }
}
