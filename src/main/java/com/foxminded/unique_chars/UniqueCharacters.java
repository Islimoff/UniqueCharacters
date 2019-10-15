package com.foxminded.unique_chars;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class UniqueCharacters implements CharCounter {

	public Map<Character, Long> countChars(String text) {
		if (text == null) {
			throw new IllegalArgumentException("text cannot be null");
		}
		return text.chars().mapToObj(character -> new Character((char) character))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}