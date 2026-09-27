package bai5;

import java.util.Scanner;

public class Solution {
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD("+a+" , "+b+") = " + sol.gcd(a,b));
        }
    }
}
