class Solution {
    public int solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }

        return lcm;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
