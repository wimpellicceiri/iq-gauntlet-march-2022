package org.wimpellicceiri.iqgauntlet2022;

public class Question1 {

    public static long sumTriangularGreaterThan(int threshold, int which) {
        int whichCounter = 0;

        for(int i = 1; i < Integer.MAX_VALUE; i++) {
            long currTriangular = triangularNumberFor(i);
            long sum = sumDigits(currTriangular);

            if(sum >= threshold) {
                whichCounter++;
                if(whichCounter == which) return i;
            }
        }

        return -1;
    }

    private static long triangularNumberFor(int number) {
        long triangularNumber = 0;

        for(int j = 1; j <= number; j++) {
            triangularNumber += j;
        }

        return triangularNumber;
    }

    private static long sumDigits(long number) {
        long sum = 0;

        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
