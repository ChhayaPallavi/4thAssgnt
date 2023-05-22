// Java program to illustrate string with
// unique characters using brute force technique
import java.util.*;

class UniqueCharacters {
	boolean uniqueCharacters(String str)
	{
		// If at any time we encounter 2 same
		// characters, return false
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;

		// If no duplicate characters encountered,
		// return true
		return true;
	}

	public static void main(String args[])
	{
		UniqueCharacters uc = new UniqueCharacters();
		String input = "This ia a java string program";

		if (uc.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
