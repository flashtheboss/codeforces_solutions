import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner katu=new Scanner(System.in);
        int t=katu.nextInt();
        while(t>0){
            int n=katu.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
            t--;
        }
    }
}