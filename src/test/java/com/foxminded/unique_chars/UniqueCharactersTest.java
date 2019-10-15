package com.foxminded.unique_chars;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.foxminded.unique_chars.UniqueCharacters;

public class UniqueCharactersTest {
	private UniqueCharacters uniqueCharacters;
	private Map<Character, Long> uniqueCharMap;

	@Before
	public void setUp() {
		uniqueCharacters = new UniqueCharacters();
		uniqueCharMap = new HashMap<>();
	}

	@Test(expected = IllegalArgumentException.class)
	public void givenNull_whenFindUniqueChars_thenExeption() throws IllegalArgumentException {
		uniqueCharacters.countChars(null);
	}

	@Test
	public void givenText_whenFindUniqueChars_thenUniqueCharMap() {
		uniqueCharMap.put('h', 1l);
		uniqueCharMap.put('e', 1l);
		uniqueCharMap.put('l', 3l);
		uniqueCharMap.put('o', 2l);
		uniqueCharMap.put(' ', 1l);
		uniqueCharMap.put('w', 1l);
		uniqueCharMap.put('r', 1l);
		uniqueCharMap.put('d', 1l);
		uniqueCharMap.put('!', 1l);
		Map<Character, Long> actual = uniqueCharacters.countChars("hello world!");

		assertEquals(uniqueCharMap, actual);
	}

	@Test
	public void givenEmptyText_whenFindUniqueChars_thenEmptyUniqueCharMap() {
		Map<Character, Long> actual = uniqueCharacters.countChars("");
		assertEquals(uniqueCharMap, actual);
	}

}
