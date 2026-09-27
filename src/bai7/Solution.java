package bai7;

public class Solution {
    public int reverse(int n) {
        long reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] test = {123, -123, 120, 0, 1534236469, -2147483412};

        for (int n : test) {
            System.out.println("reverse(" + n + ") = " + sol.reverse(n));
        }
    }
}