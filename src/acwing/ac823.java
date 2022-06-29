package acwing;
import java.io.*;
import java.util.*;
public class ac823 {
    public static int[] path;
    public static int a;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        path = new int[a];
//        bw.write(a);
        dfs(0, 0);
        bw.flush();
    }
    private static void dfs(int n, int st) throws Exception{
        if(n == a){
            for(int i = 0; i < n; i ++){
                bw.write(path[i] + 1 +" ");
            }
            bw.write("\n");
        }
        else {
            for (int i = 0; i < a; i++) {
                if ((st>>i & 1) == 0){
                    path[n] = i;
                    dfs(n + 1, st + (1 << i));
                }
            }
        }
    }
}
