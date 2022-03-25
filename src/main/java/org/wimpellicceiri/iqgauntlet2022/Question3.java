package org.wimpellicceiri.iqgauntlet2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

    public static long totalVowels() throws FileNotFoundException {
        LetterCount dracula = getLetterCountForFile(new File("dracula.txt"));
        LetterCount frankenstein = getLetterCountForFile(new File("frankenstein.txt"));

        if(dracula.getVowelRatio() > frankenstein.getVowelRatio()) return dracula.getVowels();

        return frankenstein.getVowels();
    }

    private static LetterCount getLetterCountForFile(File f) throws FileNotFoundException {
        long totalCharacters = 0, totalVowels = 0;

        try(Scanner scanner = new Scanner(f)) {
            while(scanner.hasNextLine()) {
                String charactersOnly = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");
                String vowelsOnly = charactersOnly.replaceAll("[^aeiou]", "");

                totalCharacters += charactersOnly.length();
                totalVowels += vowelsOnly.length();
            }
        }

        return new LetterCount(totalVowels, totalCharacters);
    }


    static class LetterCount {
        private final long vowels;
        private final long characters;

        public LetterCount(long vowels, long characters) {
            this.vowels = vowels;
            this.characters = characters;
        }

        public double getVowelRatio() {
            return vowels / (double) characters;
        }

        public long getVowels() {
            return vowels;
        }
    }

}
