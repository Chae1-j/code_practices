class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int start = 0;
        int end = num_list.length - 1;
        int interval = 1;

        if (n == 1) {
            end = b;
        } else if (n == 2) {
            start = a;
        } else if (n == 3) {
            start = a;
            end = b;
        } else if (n == 4) {
            start = a;
            end = b;
            interval = c;
        }

        int size = (end - start) / interval + 1;
        int[] answer = new int[size];

        int index = 0;
        for (int i = start; i <= end; i += interval) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}