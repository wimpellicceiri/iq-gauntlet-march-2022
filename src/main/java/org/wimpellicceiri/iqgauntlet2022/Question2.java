package org.wimpellicceiri.iqgauntlet2022;

public class Question2 {

    public static long fibonucci(int n) {
        if(n <= 2) return n;

        long[] memo = new long[n + 1]; // not using memo[0] for sake of readability
        memo[1] = 1;
        memo[2] = 2;

        for(int i = 3; i <= n; i++) {
            long nMinus1 = memo[i - 1];
            long nMinus2 = memo[i - 2];

            if(nMinus1 % 2 == 0) {
                memo[i] += (nMinus1 / 2);
            }
            else {
                memo[i] += nMinus1;
            }

            if(nMinus2 % 7 == 0) {
                memo[i] += nMinus2 + 1;
            }
            else {
                memo[i] += nMinus2;
            }
        }

        return memo[n];
    }
}
