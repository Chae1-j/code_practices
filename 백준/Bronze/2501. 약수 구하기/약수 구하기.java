import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) list.add(i);
        }

        if(list.size()<k) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k-1));
        }
	}
}