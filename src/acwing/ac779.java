package acwing;
import java.util.Scanner;
public class ac779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            boolean ff = true;
            String[] s = new String[n];
            for(int i = 0; i < n; i ++){
                s[i] = sc.next();
                if(s[i].equals("")){
                    ff = false;break;
                }
            }
            if(!ff) {
                System.out.println("");
                continue;
            }
            int i = 1;
            while(true){
                boolean flag1 = true;
                boolean flag2 = true;
                char c = s[0].charAt(s[0].length() - i);
                for(int j = 1; j < n; j ++){
                    if(s[j].charAt(s[j].length() - i) != c){
                        flag1 = false; break;
                    }
                }

                for(int j = 0; j < n; j ++){
                    if(i >= s[j].length()){
                        flag2 = false;break;
                    }
                }
                if(!flag1){
                    i--;
                    break;
                }
                if(!flag2){
                    break;
                }
                i ++;
            }
            System.out.println(s[0].substring(s[0].length()-i));
            n = sc.nextInt();
        }
    }
}
