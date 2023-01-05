package com.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hangman {
    private final int INITIAL_LIVES = 8;
    private int currentLives;
    private String userGuess;
    private final Display display = new Display();
    private String wordToGuess;
    private String status = "start";
    private List lettersGuessed = new ArrayList<String>();
    private List currentWord = new ArrayList<String>();
    private UserManagement userManagement = new UserManagement();



    public void run(){
        display.displayStartMessage(INITIAL_LIVES);
        setCurrentLives(INITIAL_LIVES);
        this.wordToGuess = WordManagement.getRandomWord();
        System.out.println(wordToGuess);
        addUnderScores(this.wordToGuess);
        display.displayWordToGuess(currentWord);
        display.displayLettersGuessed(lettersGuessed);
        while(getStatus().equals("start") || getStatus().equals("next")){
            display.displayLives(currentLives);
            System.out.println("Please make your guess!");
            setUserGuess(userManagement.getInput());
            String correctness = checkGuessCorrectness(getUserGuess());
            display.displayGuessOutcome(correctness);
            setStatus(checkWinOrFail(correctness));
            display.displayWordToGuess(currentWord);
            display.displayLettersGuessed(lettersGuessed);
        }
        display.displayGameOutcome(getStatus());


    }

    private void addUnderScores(String wordToGuess){
        for(int i = 0; i < wordToGuess.length(); i++){
            currentWord.add("_");
        }

    }

    private String checkGuessCorrectness (String guess){
        String result = "";
        boolean guessedCorrectly = false;
        for(int i = 0; i<lettersGuessed.size(); i++){
            if(lettersGuessed.get(i).equals(guess.toUpperCase())){
                return "guessedAlready";
            }
        }

        lettersGuessed.add(guess.toUpperCase());
        for(int i =0; i<wordToGuess.length();i++){
            if(Character.toString(wordToGuess.charAt(i)).equals(guess.toUpperCase())){
                currentWord.set(i,guess.toUpperCase());
                guessedCorrectly = true;
            }
        }
        if(guessedCorrectly){
            result = "correct";
        } else {
            result = "wrong";
            setCurrentLives(getCurrentLives() - 1);
        }

        return result;
    }

    private String checkWinOrFail(String result){
        String outcome = "next";
        if(currentLives == 0){
            outcome = "fail";
        } else if(Arrays.toString(currentWord.toArray()).replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","").replaceAll(" ", "").equals(wordToGuess)){
            outcome = "win";
        }



        return outcome;
    }

    private String getUserGuess() {
        return userGuess;
    }

    private void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

    private String getWordToGuess() {
        return wordToGuess;
    }

    private void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    private int getCurrentLives() {
        return currentLives;
    }

    private void setCurrentLives(int currentLives) {
        this.currentLives = currentLives;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
