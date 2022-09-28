package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class SadMoodConstructorTest {

	@Test
    public void given_SadMood_Should_Return_Sad() {
        SadMoodConstructor moodAnalyzer = new SadMoodConstructor();
        String mood = moodAnalyzer.analyzerMood("I am In a Sad Mood");
        Assert.assertEquals("SAD", mood);
}
}
