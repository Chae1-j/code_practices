import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(words[0].length() - 1);
        usedWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            char firstChar = currentWord.charAt(0);
            
            if (firstChar != lastChar || usedWords.contains(currentWord)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            
            lastChar = currentWord.charAt(currentWord.length() - 1);
            usedWords.add(currentWord);
        }
        
        return answer;
    }
}
