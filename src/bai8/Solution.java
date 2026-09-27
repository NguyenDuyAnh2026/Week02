package bai8;

public class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        if (n >= 0 && n < 10) {
            return true;
        }
        if (n % 10 == 0) {
            return false;
        }

        int original = n;
        int reversed = 0;

        while (n > reversed) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return (n == reversed) || (n == reversed / 10);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] test = {121, -121, 1221, 123, 0, 10, 12321};
        for (int n : test) {
            System.out.println("isPalindrome(" + n + ") = " + sol.isPalindrome(n));
        }
    }
}