package com.hangman;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserManagement {
    private Scanner scanner = new Scanner(System.in);
    protected String getInput(){
        //System.out.println("Please make your guess!");

        //Pattern pattern = Pattern.compile("^[A-Za-z]$");

        if(scanner.hasNext()){
            String guess = scanner.next();
            if(guess.length()==1 && guess.matches("^[A-Za-z]$")){
                return guess;
            } else{
                System.out.println("Please input only ONE ALPHABETICAL character.");

                return getInput();
            }

        } else {
            System.out.println("Please input only ONE ALPHABETICAL character.");
            scanner.next();
            return getInput();


        }


    }

}
