import java.util.Scanner;
 
public class Main {
 
    // Function to solve a single test case
    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // length of string x
        int m = sc.nextInt(); // length of string s
        String x = sc.next();
        String s = sc.next();
 
        // We will keep doubling x until it contains s or length exceeds a safe limit
        int operations = 0;
        String current = x;
 
        // Try up to 10 doublings (safe upper bound for constraints)
        while (current.length() < s.length()) {
            current += current;
            operations++;
        }
 
        // Check after each possible doubling
        for (int i = 0; i <= 2; i++) { // check current, current+current, etc.
            if (current.contains(s)) {
                System.out.println(operations + i);
                return;
            }
            current += current; // double again
        }
 
        // If not found
        System.out.println(-1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}