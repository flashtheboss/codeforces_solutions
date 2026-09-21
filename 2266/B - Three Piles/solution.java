import java.util.Scanner;
public class c2 {
    public static void main(String[] args){
        Scanner lul=new Scanner(System.in);
        long t=lul.nextLong();
        while(t>0){
            long a=lul.nextLong();
            long b=lul.nextLong();
            long c=lul.nextLong();
            if(a>=b){
                System.out.println(a+c-b);
            }
            else{
                long max1=a+c-b;
                if(max1<0){
                    max1=-max1;
                }
                long max2=b-a;
                if(max1>=max2){
                    System.out.println(max1);
                }
                else{
                    System.out.println(max2);
                }
            }
            t--;
        }
    }
}