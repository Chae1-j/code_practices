import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = 0;
        if(a>b){
            if(b>c) max = a;
            else max = (a>c) ? a : c;
        }
        else max = (b>c) ? b : c;

        if(a+b+c-max > max) System.out.println(a+b+c);
        else System.out.print((a+b+c-max)*2-1);
    }
}