package acwing;

import java.util.Scanner;

public class ac667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("O JOGO DUROU "+((b+24-a)%24 == 0? 24:(b+24-a)%24)+" HORA(S)");
    }
}
