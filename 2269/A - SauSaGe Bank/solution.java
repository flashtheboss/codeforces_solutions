import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
	       int n=sc.nextInt();
           int k=sc.nextInt();
           long deposit=(long)((k-1)*2+Math.pow(2,n-(k-1)));
           System.out.println(deposit);
            t--;
        }
    }
}