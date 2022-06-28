package acwing;
import java.util.Scanner;
public class ac813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] t = new int[row][col];
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                t[i][j] = sc.nextInt();
            }
        }
        print2D(t, row, col);
    }

    private static void print2D(int[][] a, int row, int col){
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
