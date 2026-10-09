import java.util.*;
public class Main2_1873C {
    public static void main(String[] args){
        Scanner tatu=new Scanner(System.in);
        int t=tatu.nextInt();
        while(t-->0){
            String[] lines=new String[10];
            for(int i=0;i<10;i++){
                lines[i]=tatu.next();
            }
            int score=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    int value=Math.min(Math .min(i,j),Math.min(9-i,9-j))+1;
                    if(lines[i].charAt(j)=='X'){
                        score+=value;
                    }
                }
            }
            System.out.println(score);
        }
    }
}