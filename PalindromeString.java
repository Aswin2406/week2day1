package week2day1;

public class PalindromeString {
	public static void main(String[] args) {
		    String word1= "ABBA";
		    String word2="  ";
		    
		    
		    for (int i = word1.length()-1; i >=0; i--) {
		    	word2=word2 + word1.charAt(i);
		    	
		    }
				System.out.println(word2);
				if(word1.equals(word2)) 
				     System.out.println("palindrome");
				else 
	         		System.out.println("not palindrome");
				
			
         	
         	}
	

}
