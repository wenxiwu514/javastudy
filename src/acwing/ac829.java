package acwing;
import java.util.Scanner;
public class ac829 {
    public static final int N = (int) 1e5 + 10;
    public static int tt = 0, hh = 0;
    public static int[] qe = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i ++){
            String op = sc.next();
            if(op.equals("push")){
                qe[tt++] = sc.nextInt();
            }
            else if(op.equals("query")){
                System.out.println(qe[hh]);
            }
            else if(op.equals("empty")){
                System.out.println(((tt == hh)?"YES":"NO"));
            }
            else{
                hh++;
            }
        }
    }
}
