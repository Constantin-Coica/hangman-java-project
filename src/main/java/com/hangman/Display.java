package com.hangman;

import java.util.Arrays;
import java.util.List;

class Display {
    protected void displayStartMessage(int numberOfLives){
        System.out.println("Welcome to the Hangman game! \n Rules: \n 1. You have " + numberOfLives + " lives.\n" +
                "2. Every correct guess will bring you a step closer to guessing the correct word.\n" +
                "3. Every incorrect guess will make you lose a life.\n" +
                "4. Guessing the same letter twice won't make you lose lives. \n" +
                "5. You win by guessing all the correct letters. \n" +
                "6. You lose by reaching 0 lives \n"+
                "7. Only single letters are allowed! (No words or numbers allowed!)");
    }

    protected void displayLives(int numberOfLives){
        System.out.println("LIVES: " + numberOfLives);
    }

    protected void displayLettersGuessed (List lettersGuessed){
        System.out.println("LETTERS GUESSED: " + Arrays.toString(lettersGuessed.toArray()));
    }

    protected void displayWordToGuess (List wordToGuess){
        System.out.println("WORD TO GUESS " + Arrays.toString(wordToGuess.toArray()));
    }

    protected void displayGuessOutcome(String result){
        switch(result){
            case("alreadyGuessed"): System.out.println("You already guessed this letter!"); break;
            case("correct"): System.out.println("You guessed correct!"); break;
            case("wrong"): System.out.println("You guessed wrong!"); break;
        }
    }

    protected void displayGameOutcome(String result){
        switch(result){
            case("win"): System.out.println("You won!"); break;
            case("fail"): System.out.println("You lost!"); break;

        }
    }



}
