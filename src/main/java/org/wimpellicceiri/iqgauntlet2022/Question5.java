package org.wimpellicceiri.iqgauntlet2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question5 {

    public static int howManyWays() throws FileNotFoundException {
        int total21s = 0;

        try(Scanner scanner = new Scanner(new File("cards.txt"))) {

            String[] cards = scanner.nextLine().split(",");

            int start = 0;
            int sum = 0;
            int aces = 0;
            for(int i = start; i < cards.length; i++) {
                if (isAce(cards[i])) aces++;

                sum += getValue(cards[i]);

                if (sum == 21 || (sum == 11 && aces > 0)) {
                    total21s++;
                }

                if(sum >= 21) {
                    sum = 0;
                    aces = 0;
                    i = start;
                    start += 1;
                }
            }
        }

        return total21s;
    }

    private static boolean isAce(String s) {
        return s.equalsIgnoreCase("A");
    }

    private static int getValue(String s) {
        if(s.equalsIgnoreCase("J")
                || s.equalsIgnoreCase("Q")
                || s.equalsIgnoreCase("K")
        ) {
            return 10;
        }

        if(s.equalsIgnoreCase("A")) return 1;

        return Integer.parseInt(s);
    }
}
