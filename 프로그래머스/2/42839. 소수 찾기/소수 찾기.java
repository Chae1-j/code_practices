import java.util.*;

class Solution {
    static int cnt = 0;
    static HashSet<Integer> nums = new HashSet<>();
    static int[] check = {};
    
    public int solution(String numbers) {
        int answer = 0;
        check = new int[numbers.length()];
        
        dfs(numbers, check, "");
        
        for(int num : nums){
            primeNumber(num);
        }
        
        answer = cnt;
        return answer;
    }
    static void dfs(String numbers, int[] check, String tmp) {

        if (tmp.length() >= 1){
            int tmpNum = Integer.parseInt(tmp);
            nums.add(tmpNum);
        }
        
        for (int i=0; i<numbers.length(); i++){

            if (check[i] == 0){
                check[i] = 1;
                tmp += numbers.charAt(i);
                dfs(numbers, check, tmp);
                tmp = tmp.substring(0, tmp.length()-1);
                check[i] = 0;
            }
        }
    }

    static void primeNumber(int n){

        if(n == 0) return;
        if(n == 1) return;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }

        cnt++;
            
    }
}