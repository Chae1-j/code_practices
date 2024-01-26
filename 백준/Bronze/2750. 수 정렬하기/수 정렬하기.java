import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}