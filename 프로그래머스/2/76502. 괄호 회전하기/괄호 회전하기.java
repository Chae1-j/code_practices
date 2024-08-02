import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (int j = 0; j < n; j++) {
                char ch = s.charAt(j);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if (ch == ')' && top != '(') {
                        isValid = false;
                        break;
                    }
                    if (ch == '}' && top != '{') {
                        isValid = false;
                        break;
                    }
                    if (ch == ']' && top != '[') {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                answer++;
            }
            
            s = s.substring(1) + s.charAt(0);
        }
        
        return answer;
    }
}
