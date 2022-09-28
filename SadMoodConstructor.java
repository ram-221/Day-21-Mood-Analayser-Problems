package com.bridgelabz;



/**
 * Purpose - “I am in Happy Mood” message Should Return Happy
 *
 */

public class SadMoodConstructor {

	private String message;

	// Default Constructor
	public SadMoodConstructor() {
	}

	// Parameterized constructor
	public SadMoodConstructor(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (this.message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
