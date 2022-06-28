package acwing;
import java.util.Scanner;
public class ac772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[26];
        for(int i = 0; i < s.length(); i ++){
            cnt[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i ++){
            if(cnt[s.charAt(i) - 'a'] == 1){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("no");
    }
}
