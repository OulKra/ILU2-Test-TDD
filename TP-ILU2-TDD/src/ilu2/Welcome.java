package ilu2;

import java.util.Iterator;

public class Welcome {

	public static String welcome(String input)
	{
		if(input != null)
		{
			input = input.replaceAll("\\s", "");
		}
		try {
			String[] name_list = input.split(",");

			if(name_list.length > 1)
			{	
				String[] noms = new String[10];
				String[] nomsCris = new String[10];
				
				int tailleNoms = 0;
				int tailleNomsCris = 0;

				String name = "";
				String resCri = "HELLO";
				for (int i = 0; i < name_list.length; i++) 
				{
					if(name_list[i].equals(name_list[i].toUpperCase()))
					{
						nomsCris[tailleNomsCris] = name_list[i];
						tailleNomsCris++;
					}
					else
					{
						noms[tailleNoms]= name_list[i].substring(0, 1).toUpperCase() + name_list[i].substring(1, name_list[i].length());
						tailleNoms++;
					}
				}
				
				for (int i = 0; i < tailleNoms-1; i++) {
					name += ", " + noms[i].substring(0, 1).toUpperCase() + noms[i].substring(1, noms[i].length());
				}
				
				for (int i = 0; i < tailleNomsCris-1; i++) {
					resCri += ", "+nomsCris[i];
				}
				
				
				if(tailleNomsCris != 0)
				{
					if(tailleNomsCris > 1)
						resCri += " AND "+nomsCris[tailleNomsCris-1] + " !";
					else
						resCri += ", "+nomsCris[tailleNomsCris-1] + " !";
				}
				
				if(tailleNoms != 0)
				{
					if(tailleNoms > 1)
						name += " and " + noms[tailleNoms-1].substring(0, 1).toUpperCase() + noms[tailleNoms-1].substring(1, noms[tailleNoms-1].length()) + ".";
					else
						name += ", " + noms[tailleNoms-1].substring(0, 1).toUpperCase() + noms[tailleNoms-1].substring(1, noms[tailleNoms-1].length()) + ".";
				}
				else
				{
					name += ".";
				}
				
				if(resCri.equals("HELLO"))
					return "Hello" + name;
				return "Hello" + name + " AND " + resCri;
			}
		}
		catch (NullPointerException e){
			
		}
		
		
		if(input == null || input.equals("") || input.trim().equals(""))
			return "Hello, my friend";
		if(input.equals(input.toUpperCase()))
			return "HELLO, "+input;
		return "Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1, input.length());		
	}
}
