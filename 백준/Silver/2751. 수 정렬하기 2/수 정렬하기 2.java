import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        for(int val : list) {
			sb.append(val).append('\n');
		}
		System.out.println(sb);
    }
}