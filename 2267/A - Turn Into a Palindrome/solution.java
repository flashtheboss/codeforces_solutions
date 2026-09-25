import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
	        int count=0;
            int n=sc.nextInt();
            char see=sc.next().charAt(0);
            String s=sc.next();
            int start=0;
            int end=s.length()-1;
            while(start<=end){
                if(s.charAt(start)!=s.charAt(end)){
                    if((s.charAt(start)==see)&&(s.charAt(end)!=see)){
                        count++;    
                    }
                    else if((s.charAt(start)!=see)&&(s.charAt(end)==see)){
			            count++;
                    }
		             else{
			            count+=2;
		            }
                }
                start++;
                end--;
            }
            System.out.println(count);
            t--;
        }
    }
}