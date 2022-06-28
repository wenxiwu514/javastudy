package acwing;
import java.util.Scanner;
public class ac743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[13][13];
        int n = sc.nextInt();
        String s = sc.next();
        double sum = 0;
        for(int i = 0; i < 12; i ++) {
            for (int j = 0; j < 12; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i < 12; i ++){
            sum += a[n][i];
        }
        if(s.equals("S")) {
            System.out.println(String.format("%.1f", sum));
        }
        else{
            System.out.println(String.format("%.1f", sum/12.0));
        }
    }
}
