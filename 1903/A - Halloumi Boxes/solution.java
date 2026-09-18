import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=1;
        while(i<=t){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] nums=new int[n];
            for(int j=0;j<n;j++){
                nums[j]=sc.nextInt();
            }
            if (k > 1) {
                System.out.println("YES");
            }
            else{
                if(sorted(nums)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            i++;
        }
    }
    static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}