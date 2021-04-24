package com.bridgelabz;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String input) {
        message = input;
    }

    public String analyseMood()  {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e){
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer");
    }
}