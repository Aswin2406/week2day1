package week2day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String text1 ="stops";
		String text2 ="potss";
		
	    char[] textarray;
	    char[] textarray1;
	    if(text1.length()== text2.length());
	    
	             textarray = text1.toCharArray();
	             System.out.println(textarray);
	             
	             textarray1 =text2.toCharArray();
	             System.out.println(textarray1);
	             
	             Arrays.sort(textarray);
	             Arrays.sort(textarray1);
	             
	             if(Arrays.equals(textarray, textarray1)) {
	             
	                   System.out.println("aragram");
	             }
	             else {
	            	 System.out.println("not aragram");
	             }
	            	 
	}

}
