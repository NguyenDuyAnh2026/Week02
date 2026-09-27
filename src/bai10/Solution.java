package bai10;

public class Solution {
    public int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }

        return max2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] testCases = {
                {3, 5, 1, 5, 9, 2},
                {10, 10, 10, 10},
                {5},
                {-1, -5, -2, -9},
                {7, 7, 3, 2}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.print("Test case " + (i + 1) + ": [");
            for (int j = 0; j < testCases[i].length; j++) {
                System.out.print(testCases[i][j] + (j < testCases[i].length - 1 ? ", " : ""));
            }
            System.out.println("] -> secondLargest = " + sol.secondLargest(testCases[i]));
        }
    }
}