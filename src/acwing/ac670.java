package acwing;
import java.util.Scanner;
public class ac670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        if(a.equals("vertebrado")){
            if(b.equals("ave")){
                if(c.equals("carnivoro")){
                    System.out.println("agula");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(c.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(b.equals("inseto")) {
                if(c.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(c.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
