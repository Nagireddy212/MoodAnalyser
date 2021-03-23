package com.bridgelabz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class moodAnalyserTest {
    @Test
    public  void givenMessage_SADIt_ReturnSad()
    {
        moodanalyser moodanalyser = new moodanalyser();
        String mood = moodanalyser.analyseMood("This is Sad Message");
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public  void givenMessage_HappyIt_ReturnHappy()
    {
        moodanalyser moodanalyser = new moodanalyser();
        String mood = moodanalyser.analyseMood("This is  Happy Message");
        Assertions.assertEquals("Happy", mood);

    }
}
