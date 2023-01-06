package com.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class WordManagement {
    private static List wordList = new ArrayList<String>();
    private static Random randomiser =new Random();

    static {
        wordList.add("ELEPHANT");
        wordList.add("EMPIRE");
        wordList.add("TEA");
        wordList.add("RHINOCEROS");
        wordList.add("BRAIN");
        wordList.add("RAINBOW");
        wordList.add("MARRIAGE");
        wordList.add("TEMPERAMENT");
        wordList.add("PHENOMENON");
        wordList.add("ABSURD");
        wordList.add("WITCHCRAFT");
        wordList.add("WHOMEVER");
        wordList.add("YACHTSMAN");
        wordList.add(("ZOMBIE"));
    }

    protected static String getRandomWord(){
        System.out.println(wordList.size());
        return (String) getWordList().get(randomiser.nextInt(wordList.size()));
    }

    protected static List convertWordToArrayList(String word){
        List toReturn = new ArrayList<>(Arrays.asList(word.split("")));
        return toReturn;
    }

    private static List getWordList(){
        return wordList;
    }

}
