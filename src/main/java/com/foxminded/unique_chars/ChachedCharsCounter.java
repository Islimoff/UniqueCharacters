package com.foxminded.unique_chars;

import java.util.HashMap;
import java.util.Map;

public class ChachedCharsCounter implements CharCounter {
	private CharCounter charCounter;
	private Map<String, Map<Character, Long>> cache = new HashMap<>();

	public ChachedCharsCounter(CharCounter charCounter) {
		this.charCounter = charCounter;
	}

	public Map<Character, Long> countChars(String text) {
		return cache.computeIfAbsent(text, value -> charCounter.countChars(text));
	}
}
