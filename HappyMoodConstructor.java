package com.bridgelabz;

public class HappyMoodConstructor {

	private String message;

	// Default Constructor
	public HappyMoodConstructor() {
	}

	// Parameterized constructor
	public HappyMoodConstructor(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (this.message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}
