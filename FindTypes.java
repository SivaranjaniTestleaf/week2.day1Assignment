package week2.day1;

public class FindTypes {

	public static void main(String[] args)
	{
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray = test.toCharArray();
		for (int j = 0; j < charArray.length; j++) 
		{
			if(Character.isLetter(charArray[j]))
			{
				letter++;
			}
			else if(Character.isDigit(charArray[j]))
			{
				num++;
			}
			else if(Character.isSpaceChar(charArray[j]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
			
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
