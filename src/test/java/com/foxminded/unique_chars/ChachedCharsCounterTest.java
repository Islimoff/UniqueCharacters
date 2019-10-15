package com.foxminded.unique_chars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ChachedCharsCounterTest {

	@Mock
	public CharCounter charCounter;

	@InjectMocks
	private ChachedCharsCounter chachedCharsCounter;

	@Test
	public void givenCharCounter_whencountChars_thenChachedCharsCounter() {
		chachedCharsCounter.countChars("hello world!");
		chachedCharsCounter.countChars("hello world!");

		verify(charCounter, atMost(1)).countChars("hello world!");

	}
}
