import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
		for(int i = 1; i < food.length; i++) {
			if(food[i]>1) {
				food[i] /= 2;
				for(int j = 1; j <= food[i]; j++) {
                    
					list.add(Integer.toString(i));
				}
			}
		}
		list.add("0");
		for(int i = list.size()-2; i >= 0; i--) {
			list.add(list.get(i));
		}
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
        return answer;
    }
}