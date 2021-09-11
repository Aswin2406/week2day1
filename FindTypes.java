package week2day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char check;
		int letter=0;
		int space=0;
		int num=0;
		int special=0;
		
		char[] arraystring= test.toCharArray();
		for (int i = 0; i < arraystring.length; i++) {
			
			  check= arraystring[i];
			  
			  
			  if(Character.isLetter(check)) {
				  letter= letter+1;
			  }else if (Character.isDigit(check)) {
				  num=num+1;
				  
				  
			  }
			  else if (Character.isSpaceChar(check))	{
				  space=space+1;
			  }
		
			  
		else {
				  special=special+1;
			  }
	
			
			
		}
	System.out.println("the letter count;"+letter);
	System.out.println("the space count:"+space);
	System.out.println("the number count:"+num);
	System.out.println("the special count:"+special);
	}

}
