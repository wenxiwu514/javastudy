import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = a % 60;
        a /= 60;
        int c = a % 60;
        a /= 60;
        int b = a;
        int m = 0;
        System.out.println(b+":"+c+":"+d);
    }
}