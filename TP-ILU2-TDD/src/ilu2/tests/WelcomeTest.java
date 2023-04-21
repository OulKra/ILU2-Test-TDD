package ilu2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ilu2.Welcome;

public class WelcomeTest {

	@Test
	public void testEX_1()
	{
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	@Test
	public void testEX_2()
	{
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome("    "), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");
	}
	
	@Test
	public void testEX_3()
	{
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome("    "), "Hello, my friend");
		assertEquals(Welcome.welcome(null), "Hello, my friend");
	}
	
	@Test
	public void testEX_4()
	{
		assertEquals(Welcome.welcome("bod,alice"), "Hello, Bod, Alice");
	}
	
	@Test
	public void testEX_5()
	{
		assertEquals(Welcome.welcome("bod,alice,noe"), "Hello, Bod, Alice, Noe");
	}
}
