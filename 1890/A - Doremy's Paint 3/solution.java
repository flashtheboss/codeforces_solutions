import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            Map<Integer, Integer> freq = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
 
            if (freq.size() == 1) {
                System.out.println("YES");
            } 
            else if (freq.size() == 2) {
                int[] counts = new int[2];
                int i = 0;
 
                for (int value : freq.values()) {
                    counts[i++] = value;
                }
 
                if (Math.abs(counts[0] - counts[1]) <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}