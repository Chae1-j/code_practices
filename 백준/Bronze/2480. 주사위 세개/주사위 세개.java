import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println(10000+(a*1000));
		} else if(a==b && b != c) {
			System.out.println(1000+(a*100));
		} else if(b==c && a != c) {
			System.out.println(1000+(b*100));
		} else if(a==c && a!=b) {
			System.out.println(1000+(c*100));
		} else if(a!=b && b!=c && a!=c) {
			if(a>b && a>c) {
				System.out.println(100*a);
			} else if(b>a && b>c) {
				System.out.println(100*b);
			} else if(c>a && c>b) {
				System.out.println(100*c);
			}
		}
    }    
}