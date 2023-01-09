package com.main;

import com.hangman.Hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String keepRunning = "y";
        Scanner scanner = new Scanner(System.in);
        /* ***
            I figured it is better to add the loop in the main methods and not in the Hangman class as that would
            make it less reusable.Also it is easier to test it. Moreover hangman.run() already has a while loop.
        *** */
        while(keepRunning.equals("y")) {
            Hangman hangman = new Hangman();
            hangman.run();
            System.out.println("Would you like to play again? Y/N");
            keepRunning = scanner.next();


        }
    }
}