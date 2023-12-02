import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for(char c = 'a'; c <= 'z'; c++) {
			sb.append(s.indexOf(c) + " ");
		}
		System.out.println(sb);
    }
}