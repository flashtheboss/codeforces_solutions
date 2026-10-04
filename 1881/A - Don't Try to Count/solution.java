import java.util.*;
 
public class Main{
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String x = sc.next();
            String s = sc.next();
 
            String s1=x;
            String s2=s1+s1;
            String s3=s2+s2;
            String s4=s3+s3;
            String s5=s4+s4;
            String s6=s5+s5;
            int count=-1;
            if(s1.contains(s)){
                count=0;
            }
            else if(s2.contains(s)){
                count=1;
            }
            else if(s3.contains(s)){
                count=2;
            }
            else if(s4.contains(s)){
                count=3;
            }
            else if(s5.contains(s)){
                count=4;
            }
            else if(s6.contains(s)){
                count=5;
            }
            System.out.println(count);
        }
 
        sc.close();
    }
}