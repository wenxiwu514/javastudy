package acwing;
import java.util.Scanner;
public class ac818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] d = new int[a];
        for(int i = 0; i < a; i ++){
            d[i] = sc.nextInt();
        }
        sort(d, b, c);
    }
    private static void sort(int[] a, int l ,int r){
        for(int i = l; i <= r; i ++){
            for(int j = l; j < i; j ++){
                if(a[j] > a[i]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i] +" ");
        }
    }
}
