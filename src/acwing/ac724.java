package acwing;
import java.util.Scanner;
public class ac724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= n; j ++){
                if(Math.abs(i - n/2 - 1) + Math.abs(j - n/2 - 1) <= n/2){
                    System.out.print("*");}
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
