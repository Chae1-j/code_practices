import java.util.HashMap;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int totalWant = 0;
        for (int num : number) {
            totalWant += num;
        }
        
        int validPeriods = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();
            
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            
            boolean valid = true;
            for (int k = 0; k < want.length; k++) {
                if (discountMap.getOrDefault(want[k], 0) < number[k]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                validPeriods++;
            }
        }
        
        return validPeriods;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {
            "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
            "pot", "banana", "apple", "banana"
        };
        
    }
}
