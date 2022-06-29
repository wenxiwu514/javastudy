package acwing;
import java.util.Scanner;
public class ac828 {
    public static final int N = (int) 1e5 + 10;
    public static int tt = 0;
    public static int[] st = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i ++){
            String op = sc.next();
            if(op.equals("push")){
                st[++tt] = sc.nextInt();
            }
            else if(op.equals("query")){
                System.out.println(st[tt]);
            }
            else if(op.equals("empty")){
                System.out.println(((tt == 0)?"YES":"NO"));
            }
            else{
                tt--;
            }
        }
    }
}
