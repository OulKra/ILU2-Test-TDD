package ilu2;


public class Welcome {

	public static String welcome(String input)
	{
		try {
			String[] name_list = input.split(",");
			System.out.println(name_list.length);

			if(name_list.length > 1)
			{	
				String name = "";
				String resCri = "HELLO";
				for (int i = 0; i < name_list.length; i++) {
					if(name_list[i].equals(name_list[i].toUpperCase()))
						resCri += ", "+name_list[i];
					else
						name += (", " + name_list[i].substring(0, 1).toUpperCase() + name_list[i].substring(1, name_list[i].length()));
				}
				if(resCri.equals("HELLO"))
					return "Hello" + name;
				return "Hello" + name + ". AND " + resCri;
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
