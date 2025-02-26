class Solution {
    public int[] solution(long n) {
        String[] nStr = Long.toString(n).split("");
		int[] answer = new int[nStr.length];
		
		for(int i = 0; i < nStr.length; i++) {
			answer[i] = Integer.parseInt(nStr[nStr.length-1-i]);
		}
        return answer;
    }
}