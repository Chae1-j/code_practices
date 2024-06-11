import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = "long int";
		String str1 = "long ";

		if(a/4>1) {
			for(int i=1;i<a/4; i++) {
				System.out.print(str1);
			} System.out.println(str);
		} else if(a%4==0) {
			System.out.println(str);
		}
	}
}