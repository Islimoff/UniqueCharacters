package com.foxminded.unique_chars;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String end;
		CharCounter charCounter = new ChachedCharsCounter(new UniqueCharacters());
		do {
			System.out.println("Input text: ");
			String text = scanner.nextLine();
			showResult(charCounter.countChars(text));
			System.out.println("Continue? Y or N");
			end = scanner.nextLine();
		} while (end.equals("Y"));
		scanner.close();
	}

	public static void showResult(Map<Character, Long> uniqueCharMap) {
		Set<Map.Entry<Character, Long>> set = uniqueCharMap.entrySet();
		for (Map.Entry<Character, Long> charCount : set) {
			System.out.println("\"" + charCount.getKey() + "\"" + " - " + charCount.getValue());
		}
	}
}
