package org.wimpellicceiri.iqgauntlet2022;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        long answer1 = Question1.sumTriangularGreaterThan(10, 27);
        System.out.println("1) " + answer1);

        long answer2 = Question2.fibonucci(50);
        System.out.println("2) " + answer2);

        long answer3 = Question3.totalVowels();
        System.out.println("3) " + answer3);

        long answer4 = Question4.findSumOfData();
        System.out.println("4) " + answer4);

        long answer5 = Question5.howManyWays();
        System.out.println("5) " + answer5);
    }
}
