package acwing;

import java.util.Scanner;
public class ac753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            for(int i = 1; i <= n; i ++){
                for(int j = 1; j <= n; j ++){
                    System.out.print(Math.min(Math.min(Math.min(i-0,n+1-i),j-0),n+1-j));
                }
                System.out.println();
            }
            System.out.println();
            n = sc.nextInt();
        }
    }
}
