package acwing;
import java.util.Scanner;
public class ac721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a != 0){
            for(int i = 1; i <= a; i ++){
                System.out.print(i+" ");
            }
            System.out.println();
            a = sc.nextInt();
        }
    }
}
