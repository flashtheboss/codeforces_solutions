import java.util.Scanner;
public class aandu{
    public static void main(String[] args){
        Scanner tatta=new Scanner(System.in);
        int N=tatta.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=tatta.nextInt();
        }
        long min=Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            long value=Math.abs((long)arr[i]);
            if(value<min){
                min=value;
            }
        }
        System.out.println(min);
        
    }
}