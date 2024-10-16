package com.example.new_project_02.utils;

public class TextCounter {
    public static int getCharsCount(String userInput){
        return userInput.length();
    }

    public static int getWordCount(String userInput){
        if(userInput==null || userInput.isEmpty()){
            return 0;
        }
        String[] words = userInput.trim().split("\\s+");
        return words.length;
    }
}
