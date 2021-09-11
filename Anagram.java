package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
       String name="stops";
       String name1="potss";
       int length = name.length();
       int length1 = name1.length();
       if(length == length1)
       {
    	   char[] chrArr= name.toCharArray();
    	   char[] chrArr1=name1.toCharArray();
    	   Arrays.sort(chrArr);
    	   Arrays.sort(chrArr1);
    	   for (int i = 0; i < chrArr1.length; i++) 
    	   {
    		   if(chrArr[i] == chrArr[i])
        	   {
        		   System.out.println("The string is equal: " + chrArr[i]);
        	   }
        	   else
        	   {
        		   System.out.println("The string is not equal: " + chrArr[i]);
        	   }
		   }
    	     	  
       }
       
		
	}

}
