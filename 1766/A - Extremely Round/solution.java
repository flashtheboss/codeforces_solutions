import java.util.Scanner;
public class kuttu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t>0){
            long n=sc.nextLong();
            if(n<=9){
                System.out.println(n);
            }
            else{
                long pow=count(n);
                long left=n/(long)Math.pow(10,pow-1);
                System.out.println(9*(pow-1)+left);
            }
            t--;
        }
    }
    static long count(long n){ 
 
        long count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}