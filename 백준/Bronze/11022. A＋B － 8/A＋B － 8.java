import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int brr[] = new int[num];
        int result[] = new int[num];
        
        for (int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            arr[i] = a;
            brr[i] = b;
            result[i] = a+b;
        }
        
        for (int i=0; i<num; i++){
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, arr[i], brr[i], result[i]);
        }
    }
}