class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str1 = my_string.substring(0,s);
        String str2 = my_string.substring(s,e+1);
        String str3 = "";
        StringBuilder sb = new StringBuilder(str2);
        if(my_string.length() > e) {
            str3 = my_string.substring(e+1
                                      );
        }
        str2 = sb.reverse().toString();
        answer = str1+str2;
        if(str3!=null) {
            answer += str3;
        }
        return answer;
    }
}