import java.util.HashSet;
import java.util.Scanner;
public class Main1890A{
    public static void main(String[] args){
        Scanner katu=new Scanner(System.in);
        int t=katu.nextInt();
        while(t>0){
            int n=katu.nextInt();
            long[] arr=new long[n];
             HashSet<Long> alag=new HashSet<Long>();
            for(int i=0;i<n;i++){
                arr[i]=katu.nextLong();
                alag.add(arr[i]);
            }
 
            if(alag.size()==1){
                System.out.println("YES");
            }
            else if(alag.size()==2){
                int count1=0,count2=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==arr[0]){
                        count1++;
                    }
                    else{
                        count2++;
                    }
                }
                if(((count1==(n/2))&&count2==((n+1)/2))||((count1==((n+1)/2))&&count2==(n/2))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}