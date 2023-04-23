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
		assertEquals(Welcome.welcome("bod,alice"), "Hello, Bod and Alice.");
	}
	
	@Test
	public void testEX_5()
	{
		assertEquals(Welcome.welcome("bod,alice,noe"), "Hello, Bod, Alice and Noe.");
	}
	
	@Test
	public void testEX_6()
	{
		assertEquals(Welcome.welcome("bod,ALICE,noe"), "Hello, Bod and Noe. AND HELLO, ALICE !");
		assertEquals(Welcome.welcome("bod,ALICE,NOE"), "Hello, Bod. AND HELLO, ALICE AND NOE !");
		assertEquals(Welcome.welcome("BOB,ALICE"), "Hello. AND HELLO, BOB AND ALICE !");
	}
	
	@Test
	public void testEX_7()
	{
		assertEquals(Welcome.welcome("bob,amy,jerry"), "Hello, Bob, Amy and Jerry.");
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
}
