package ilu2;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Iterator;


public class Welcome {

	
	static int existe(SimpleEntry<String, Integer>[] tableau, String val) 
	{
		int i = 0;
		while(tableau[i] != null)
		 {
			 if(tableau[i].getKey().equals(val))
				 return i;
			 i++;
		 }
		 return -1;
	}
	
	public static String welcome(String input)
	{

		if(input != null)
		{
			input = input.replaceAll("\\s", "");
		}

		try 
		{
			String[] name_list = input.split(",");
			
			if(name_list.length > 1)
			{		

				SimpleEntry<String, Integer>[] noms = new SimpleEntry[10];
		        SimpleEntry<String, Integer>[] nomsCris = new SimpleEntry[10];
 				
				int tailleNoms = 0;
				int tailleNomsCris = 0;

				String name = "";
				String resCri = "";

				for (int i = 0; i < name_list.length; i++) 
				{
					int position;
					if(name_list[i].equals(name_list[i].toUpperCase()))
					{
						if((position = existe(nomsCris, name_list[i])) != -1)
							nomsCris[position].setValue(nomsCris[position].getValue() + 1);
						else
						{
							nomsCris[tailleNomsCris] = new SimpleEntry<>(name_list[i], 1);
							tailleNomsCris++;
						}
					}
					else
					{
						String nomModif = name_list[i].substring(0, 1).toUpperCase() + name_list[i].substring(1, name_list[i].length());
						if((position = existe(noms, nomModif)) != -1)
							noms[position].setValue(noms[position].getValue() + 1);
						else
						{
							noms[tailleNoms] = new SimpleEntry<>(nomModif, 1);
							tailleNoms++;
						}

					}
				}
				
				for (int i = 0; i < tailleNoms-1; i++) {
					if(noms[i].getValue() != 1)
						name += noms[i].getKey().substring(0, 1).toUpperCase() + noms[i].getKey().substring(1, noms[i].getKey().length()) + " (x"+ noms[i].getValue() + ")" + ", ";
					else
						name += noms[i].getKey().substring(0, 1).toUpperCase() + noms[i].getKey().substring(1, noms[i].getKey().length()) + ", ";
				}
				
				for (int i = 0; i < tailleNomsCris-1; i++) {
					if(nomsCris[i].getValue() != 1)	
						resCri += nomsCris[i].getKey() + " (x"+ nomsCris[i].getValue() + ")" + ", ";
					else
						resCri += nomsCris[i].getKey() + ", ";
				}
				
				if(tailleNomsCris != 0)
				{
					if(tailleNomsCris > 1)
						if(nomsCris[tailleNomsCris-1].getValue() != 1)	
							resCri = resCri.substring(0, resCri.length()-1) + " AND "+nomsCris[tailleNomsCris-1].getKey() + " (x"+ nomsCris[tailleNomsCris-1].getValue() + ")";
						else
							resCri = resCri.substring(0, resCri.length()-2) + " AND "+nomsCris[tailleNomsCris-1].getKey() + " !";
					else
						if(nomsCris[tailleNomsCris-1].getValue() != 1)	
							resCri += ", "+nomsCris[tailleNomsCris-1].getKey() + " (x"+ nomsCris[tailleNomsCris-1].getValue() + ")";
						else
							resCri += ", "+nomsCris[tailleNomsCris-1].getKey() + " !";
				}
				
				if(tailleNoms != 0)
				{
					if(tailleNoms > 1)
						if(noms[tailleNoms-1].getValue() != 1)	
							name = name.substring(0, name.length()-1) + " and " + noms[tailleNoms-1].getKey().substring(0, 1).toUpperCase() + noms[tailleNoms-1].getKey().substring(1, noms[tailleNoms-1].getKey().length()) + " (x"+ noms[tailleNoms-1].getValue() + ")"+ ".";
						else
							name = name.substring(0, name.length()-2) + " and " + noms[tailleNoms-1].getKey().substring(0, 1).toUpperCase() + noms[tailleNoms-1].getKey().substring(1, noms[tailleNoms-1].getKey().length()) + ".";
					else
						if(noms[tailleNoms-1].getValue() != 1)	
							name += ", " + noms[tailleNoms-1].getKey().substring(0, 1).toUpperCase() + noms[tailleNoms-1].getKey().substring(1, noms[tailleNoms-1].getKey().length())  + " (x"+ noms[tailleNoms-1].getValue() + ")" + ".";
						else
							name += ", " + noms[tailleNoms-1].getKey().substring(0, 1).toUpperCase() + noms[tailleNoms-1].getKey().substring(1, noms[tailleNoms-1].getKey().length()) + ".";
				}
				else
					name += ".";
								
				if(existe(noms, "Yoda") != -1)
				{
					if(existe(nomsCris, "YODA") != -1)
					{
						if(resCri.equals(""))
							return name.substring(0, name.length()-1) + ", Hello";
						else
							return name.substring(0, name.length()-1) + ", Hello. AND " + resCri + " HELLO !";
					}
					else
					{
						if(resCri.equals(""))
							return name.substring(0, name.length()-1) + ", Hello";
						else
							return name.substring(0, name.length()-1) + ", Hello. AND HELLO" + resCri.substring(1, resCri.length());
					}
					
				}
				else
				{
					if(resCri.startsWith(","))
					{
						resCri = resCri.substring(2);
					}
					
					if(name.startsWith(","))
					{
						name = name.substring(2);
					}
					System.out.println("name  " + name);
					if(existe(nomsCris, "YODA") != -1)
					{
						if(resCri.equals(""))
						{
							if(name.equals("."))
								return "Hello " + name;
							return "Hello, " + name;
						}
						else
						{
							if(name.equals("."))
								return "Hello " + name +" AND " + resCri.substring(0, resCri.length()-2) + " HELLO !";
							return "Hello, " + name +" AND " + resCri.substring(0, resCri.length()-2) + " HELLO !";
						}
					}
					else
					{
						if(resCri.equals(""))
						{
							if(name.equals("."))
								return "Hello " + name;
							return "Hello, " + name;
						}
						else
						{
							if(name.equals("."))
								return "Hello" + name + " AND HELLO, " + resCri;
							return "Hello, " + name + " AND HELLO, " + resCri;
						}
					}
				}

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
