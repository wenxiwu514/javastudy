package acwing;
import java.util.Scanner;
public class ac747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double[][] a = new double[13][13];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        int t = 0;
        for (int i = 0; i < 12; i++) {
            for(int j = 0; j + i < 11; j ++){
                sum += a[i][j];
                t ++;
            }
        }
        if(s.equals("S")){
            System.out.printf("%.1f",sum);
        }
        else{
            System.out.printf("%.1f", sum/t);
        }

    }
}
