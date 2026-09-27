import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==2){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println(-1);
            }
            else{
                int shout=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==2){
                       shout++;
                    }
                    if(shout>=count/2){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
            
            t--;
        }
    }
}