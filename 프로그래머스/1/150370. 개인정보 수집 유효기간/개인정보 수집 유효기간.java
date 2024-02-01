import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        String td[] = today.split("[.]"); //{2022, 05, 19}
        int tdY = Integer.parseInt(td[0]);
        int tdM = Integer.parseInt(td[1]);
        int tdD = Integer.parseInt(td[2]);
        
        for(String term:terms){
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));             
        }
        
        for(int i=privacies.length-1; i>=0; i--){
            String priArr[] = privacies[i].split("[. ]"); //{2021, 05, 02, A}
            int termM = map.get(priArr[3]); //계약서 기간 가져옴 A
            int priY = Integer.parseInt(priArr[0]);
            int priM = Integer.parseInt(priArr[1]);
            int priD = Integer.parseInt(priArr[2]);
            int month = (priM + termM) % 12;
            int year = (priM + termM) / 12 + priY;
       
            if(month == 0 ){
                month = 12;
                year -= 1;
            }
            
            if(tdY > year || (tdY==year && tdM > month) 
               || (tdY==year && tdM==month && tdD >= priD))
                st.push(i+1);
        }
        
        int[] answer = new int[st.size()];
        for(int i=0; i<privacies.length; i++){
            if(st.empty())
                break;
            answer[i] = st.pop(); 
        }
        
        return answer;
    }
}