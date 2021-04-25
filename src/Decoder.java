import java.util.ArrayList;
import java.util.Scanner;
public class Decoder {

	public static void main(String[] args) {
		Database.createElements();
		System.out.println("Options: \n1. Decode(elements to words) \n2. Encrypt(words to elements)");
		Scanner choiceIn = new Scanner(System.in);
		int choice = choiceIn.nextInt();
		if(choice == 1)
			decode();
		else if(choice == 2)
			encrypt();
		else
			System.out.println("Error");
	}
	public static void encrypt()
	{
		System.out.println("Enter your message below. You may only use \",\", \".\", \"!\", \"?\", \"'\", and \"-\".");
		Scanner userWordIn = new Scanner(System.in);
		String wordIn = userWordIn.nextLine();
		wordIn += "";
		while(wordIn.length() > 1)
		{
			boolean found = false;
			for(int i = 0; i < Database.doubles.size(); i++)
			{
				if(wordIn.substring(0, 2).toLowerCase().equals(Database.doubles.get(i).getSymbol()))
				{
					System.out.print(Database.doubles.get(i).getName() + " ");
					wordIn = wordIn.substring(2);
					if(wordIn.length() < 2)
						i += 500;
					continue;
				}
			}
			if(wordIn.length() < 1)
			{
				continue;
			}
			if(!found)
			{
				for(int j = 0; j < Database.singles.size(); j++)
				{
					if(wordIn.substring(0, 1).toLowerCase().equals(Database.singles.get(j).getSymbol()))
					{
						found = true;
						System.out.print(Database.singles.get(j).getName() + " ");
						wordIn = wordIn.substring(1);
						if(wordIn.length() < 1)
							j += 500;
						continue;
					}
				}
			}
			if(!found)
			{
				if(wordIn.length() < 1)
				{
					//nothing
				}
				else
				{
					for(int k = 0; k < Database.leftovers.size(); k++)
					{				
						if(wordIn.substring(0, 1).toLowerCase().equals(Database.leftovers.get(k).getSymbol()))
						{
							if(Database.leftovers.get(k).getName().equals(" ")) 
								System.out.print(Database.leftovers.get(k).getName());
							else
								System.out.print(Database.leftovers.get(k).getName() + " ");
							wordIn = wordIn.substring(1);
							k+= 500;
							if(wordIn.length() < 1)
								k += 500;
							
						}
					}
				}
			}
		}
	}
	public static void decode()
	{
		System.out.println("Enter each element separated by a space:");
		Scanner elementsIn = new Scanner(System.in);
		String elementsLine = elementsIn.nextLine();
		String[] elementsArr = elementsLine.split(" ");
		ArrayList<String> elements = new ArrayList<String>();
		for(int j = 0; j < elementsArr.length; j++)
			elements.add(elementsArr[j]);
		for(int i = 0; i < elements.size(); i++)
		{
			boolean notFound = true;			
			if(notFound)
			{
				for(ArrayList<Element> a : Database.elementList)
				{
					for(Element e : a)
					{
						if(e.getName().equals(elements.get(i).toLowerCase()))
						{
							System.out.print(e.getSymbol());
						}
					}
				}
				
			}
			
				
			
		}
	}
	
}
