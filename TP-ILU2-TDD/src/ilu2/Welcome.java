package ilu2;


public class Welcome {

	public static String welcome(String input)
	{
		if(input == null || input == "" || input.trim().equals(""))
			return "Hello, my friend";
		return "Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1, input.length());		
	}
}
