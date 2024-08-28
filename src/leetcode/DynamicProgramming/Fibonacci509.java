package leetcode.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci509 {
    public static void main(String[] args) {
        System.out.println("1: " + fib(10));
        System.out.println("2: " + memoization(10));
    }
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //beat 100% but with small n
    public static int binetFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;

        // Psi (negative reciprocal of phi)
        double psi = (1 - Math.sqrt(5)) / 2;

        // Binet's Formula
        double fibonacciN = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);

        // Round the result to the nearest integer
        return (int) Math.round(fibonacciN);
    }
    //more space, less time
    public static int memoization(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int fib = memoization(n - 1) + memoization(n - 2);
        memo.put(n, fib);

        return fib;
    }
}
