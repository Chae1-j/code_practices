import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            int dec = scan.nextInt();
            if(dec == 1) continue;
            int chk = 0;
            for(int j = 1; j <= dec; j++) {
                if(dec % j == 0) chk++;
            }
            if(chk == 2) cnt++;
        }
        System.out.println(cnt);
    }
}
