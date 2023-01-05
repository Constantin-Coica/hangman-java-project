package com.hangman;

public class Hangman {
    private int lives = 8;
    private char userGuess;
    private Display display = new Display();
    private String wordToGuess;



    public void run(){
        display.displayStartMessage(getLives());
    }

    private int getLives() {
        return lives;
    }

    private void setLives(int lives) {
        this.lives = lives;
    }

    private char getUserGuess() {
        return userGuess;
    }

    private void setUserGuess(char userGuess) {
        this.userGuess = userGuess;
    }

    private String getWordToGuess() {
        return wordToGuess;
    }

    private void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }
}
