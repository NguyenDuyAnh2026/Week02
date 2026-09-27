package bai4;

public class Solution {
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        long tmp = 0;

        for (long i = 2; i <= n; i++) {
            if (a > Long.MAX_VALUE - b) {
                return Long.MAX_VALUE;
            }
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long[] testValues = {0, 1, 5, 10, 50, 95, 100};
        for (long n : testValues) {
            System.out.println("Fibonacci(" + n + ") = " + sol.fibonacci(n));
        }
    }
}