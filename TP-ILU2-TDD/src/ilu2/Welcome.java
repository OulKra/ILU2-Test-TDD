package ilu2;


public class Welcome {

	public static String welcome(String input)
	{
		try {
			String[] name_list = input.split(",");
			if(name_list.length > 1)
			{
				String name = name_list[0].substring(0, 1).toUpperCase() + name_list[0].substring(1, name_list[0].length());
				for (int i = 1; i < name_list.length; i++) {
					System.out.println(name_list[i]);
					name += (", " + name_list[i].substring(0, 1).toUpperCase() + name_list[i].substring(1, name_list[i].length()));
				}
				return "Hello, " + name;
				
			}
		}
		catch (NullPointerException e){
			;
		}
		
		
		if(input == null || input.equals("") || input.trim().equals(""))
			return "Hello, my friend";
		if(input.equals(input.toUpperCase()))
			return "HELLO, "+input;
		return "Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1, input.length());		
	}
}
