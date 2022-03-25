package org.wimpellicceiri.iqgauntlet2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

    public static long findSumOfData() throws FileNotFoundException {
        long sum = 0;

        try(Scanner scanner = new Scanner(new File("data.txt"))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for(int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
            }
        }

        return sum;
    }
}
