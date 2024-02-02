import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int avg = 0;
        for(int i = 0; i < 5; i++) {
            avg += arr[i];
        }
        System.out.println(avg/5);
        System.out.println(arr[2]);
    }
}