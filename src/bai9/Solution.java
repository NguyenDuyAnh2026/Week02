package bai9;

public class Solution {
    public int sumOfDigits(int n) {
        int sum = 0;
        long temp = Math.abs((long) n);

        while (temp > 0) {
            sum += (int) (temp % 10);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] testValues = {123, -123, 1950, 0, 9999, -4567};
        for (int n : testValues) {
            System.out.println("sumOfDigits(" + n + ") = " + sol.sumOfDigits(n));
        }
    }
}