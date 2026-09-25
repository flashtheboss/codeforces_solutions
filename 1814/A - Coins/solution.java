import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner tat=new Scanner(System.in);
        long t=tat.nextLong();
        while(t>0){
            long n=tat.nextLong();
            long k=tat.nextLong();
            if(n%2==0){
                System.out.println("YES");
            }
            else{
                if(k%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            t--;
        }
    }
}