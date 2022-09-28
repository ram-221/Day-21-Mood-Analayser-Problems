package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HappyMoodConstructorTest {

	@Test
	public void givenMessage_SadMood_Should_Return_Sad() {
		HappyMoodConstructor moodAnalyzer = new HappyMoodConstructor("I am In a Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		// Asserting The Result As Boolean Type True Or False
		Assert.assertEquals("SAD", mood);

	}

	@Test
	public void givenMessage_AnyMood_Should_Return_HAPPY() {
		HappyMoodConstructor moodAnalyser = new HappyMoodConstructor("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
}
}
