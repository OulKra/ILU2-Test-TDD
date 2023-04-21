package ilu2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ilu2.Welcome;

public class WelcomeTest {

	@Test
	public void test()
	{
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
}
