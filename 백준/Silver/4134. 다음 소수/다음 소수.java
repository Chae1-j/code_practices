import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            sb.append(nextPrime(n)).append("\n");
        }
        
        System.out.print(sb);
    }
    
    private static long nextPrime(long n) {
        if (n <= 1) return 2;
        while (!isPrime(n)) n++;
        return n;
    }
    
    private static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        
        return true;
    }
}