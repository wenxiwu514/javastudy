package acwing;
import java.util.Scanner;
public class ac737 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < 10; i ++){
            a[i] = sc.nextInt();
            if(a[i] <= 0){a[i] = 1;}
            System.out.println("X["+i+"] = "+a[i]);
        }
    }
}
