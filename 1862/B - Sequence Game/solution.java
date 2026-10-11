import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner tatu=new Scanner(System.in);
        int t=tatu.nextInt();
        while(t-->0){
            int n=tatu.nextInt();
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=tatu.nextInt();
            }
            ArrayList<Integer> cup=new ArrayList<>();
            cup.add(b[0]);
            for(int j=1;j<n;j++){
                
                if(b[j]>b[j-1]){
                        if(b[j-1]!=1){
                            cup.add(b[j-1]-1);
                            cup.add(b[j]);
                        }
                        else{
                            cup.add(b[j]);
                        }
                }
                else if(b[j]<b[j-1]){
                    cup.add(b[j]);
                    cup.add(b[j]);
                }
                else{
                    cup.add(b[j]);
                    continue;
                }
            }
            int m=cup.size();
            System.out.println(m);
            for(int j=0;j<m;j++){
                System.out.println(cup.get(j));
            }
        }
    }
}