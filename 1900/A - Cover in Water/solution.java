import java.util.Scanner;
import java.util.ArrayList;
public class atta {
    public static void main(String[] args){
        Scanner tatti =new Scanner(System.in);
        int t=tatti.nextInt();
        while(t>0){
            int min=0;
            int n =tatti.nextInt();
            String s=tatti.next();
            int count=0;
            ArrayList<Integer> cum=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='#'||i==s.length()-1){
                    if(s.charAt(i)=='.'){
                        count++;
                    }
                    cum.add(count);
                    count=0;
                    continue;
                }
                else{
                    count++;
                }
            }
            for(int j=0;j<cum.size();j++){
                if(cum.get(j)>2){
                    min=2;
                    break;
                }
                else if((cum.get(j)==2)||(cum.get(j)==1)){
                    min=min+cum.get(j);
                }
                else{
                    continue;
                }
            }
            System.out.println(min);
            t--;
        }
    }
}