import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = gcd(a,b);

            sb.append(a * b / c).append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b) {
        while(b != 0) {
            int c = a % b;

            a = b;
            b = c;
        }
        return a;
    }
}