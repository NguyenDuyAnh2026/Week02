package bai6;

public class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    static void main(String[] args) {
        Solution sol = new Solution();
        int[] testValues = {-5, 0, 1, 2, 3, 4, 17, 18, 97, 100, 2147483647};
        for(int x : testValues){
            System.out.println("isPrime("+ x +") : " + sol.isPrime(x));
        }
    }

}
