package acwing;
import java.util.Scanner;
public class ac770 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        for(int i = 0; i < strs.length; i ++){
            if(strs[i].equals(s1)){
                System.out.print(s2 +" ");
            }
            else{
                System.out.print(strs[i] + " ");
            }
        }
    }
}
