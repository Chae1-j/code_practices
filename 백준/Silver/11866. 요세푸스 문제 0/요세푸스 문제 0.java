import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;

        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size();
            result.add(people.remove(index));
        }

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.println(">");
        
        sc.close();
    }
}
