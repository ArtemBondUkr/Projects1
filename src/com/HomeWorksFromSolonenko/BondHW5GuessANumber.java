package com.HomeWorksFromSolonenko;

import java.util.Scanner;

public class BondHW5GuessANumber {
    static Scanner in = new Scanner(System.in);
    static final int MIN = 10;
    static final int MAX = 100;

    public static void main(String[] args) {
        playRound(MIN, MAX);
    }

    private static void playRound(int min, int max) {
        boolean playAgain;
        do {
            pln("Guess a number from " + min + " to " + max + ".");
            int randomNumber = randomInt(min, max);
            playGuessANumber(randomNumber);
            pln("Congrats, you guess a number!!!");
            pln("Do you play again?(y/n): ");
            String playAgainStr = in.next();
            playAgain = "y".equalsIgnoreCase(playAgainStr);
        } while (playAgain);
    }

    private static void playGuessANumber(int randomNumber) {
        int guess;
        do {
            p("Make guess a number: ");
            guess = in.nextInt();
            if (guess < randomNumber) {
                pln("More...");
            }
            if (guess > randomNumber) {
                pln("Less...");
            }
        } while (guess != randomNumber);
    }

    private static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min + 1) + min));
    }

    private static void pln(Object o) {
        System.out.println(o);
    }

    private static void p(Object o) {
        System.out.print(o);
    }

    private static void pln() {
        System.out.println();
    }
}
