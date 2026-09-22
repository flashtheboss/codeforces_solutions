import java.util.Scanner;
public class linetrip{
    public static void main(String[] args){
        Scanner lul=new Scanner(System.in);
        int t=lul.nextInt();
        while(t>0){
            int n=lul.nextInt();
            int x=lul.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=lul.nextInt();
            }
            int minv1=a[0];
            int minv2=2*(x-a[n-1]);
            for(int i=1;i<n;i++){
                if((a[i]-a[i-1])>minv1){
                    minv1=a[i]-a[i-1];
                }
            }
            if(minv1>minv2){
                System.out.println(minv1);
            }
            else{
                System.out.println(minv2);
            }
            t--;
        }
    }
}