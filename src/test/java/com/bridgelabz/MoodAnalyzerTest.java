package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy()  {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
}