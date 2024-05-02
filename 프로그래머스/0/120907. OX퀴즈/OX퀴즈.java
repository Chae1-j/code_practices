class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];        
        for (int i = 0; i < quiz.length; i++) {
            String[] sArr = quiz[i].split(" ");
            int num1 = Integer.parseInt(sArr[0]);
            String str = sArr[1];
            int num2 = Integer.parseInt(sArr[2]);
            int result = Integer.parseInt(sArr[4]);
            int cal = str.equals("+") ? num1 + num2 : num1 - num2;
            answer[i] = cal == result ? "O" : "X";
        }
        return answer;
    }
}