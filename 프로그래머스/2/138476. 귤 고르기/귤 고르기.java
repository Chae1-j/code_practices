import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int size : tangerine) {
            frequencyMap.put(size, frequencyMap.getOrDefault(size, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        frequencies.sort(Collections.reverseOrder());

        for (int freq : frequencies) {
            k -= freq;
            answer++;
            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}
