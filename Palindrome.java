package week2.day1;

public class Palindrome {

	public static void main(String[] args) 
	{
		String name = "mad",reverse="";
		char[] chrArr = name.toCharArray();
		for (int i = chrArr.length-1;i>=0; i--)
		{
			reverse = reverse + chrArr[i];
			
		}
		if(reverse.equalsIgnoreCase(name))
		{
			System.out.println("The name is palindrome: "+ name);
		}
		
		
	}

}
