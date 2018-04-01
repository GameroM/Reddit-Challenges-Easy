package reddit_easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Write a program that will validate a phone number. The telephone number must be 10 digits, can have dashes, dots, spaces, or area code
// parenthesized 
// Good phone #s: 1234567890, 123-456-2342, 123.456.7890, (123) 456-7809
// Bad phone numbers: 123-45-6789, 123:4567890, 123/456-7890

public class Challenge10 {
	
	public static void main(String [] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please type in a phone number: ");
		String usernum = userin.nextLine();
		System.out.println(isPhoneNumberValid(usernum));
		userin.close();
		
		
	}
	public static boolean isPhoneNumberValid(String phoneNumber) //
	{
	    
	  
	    // Initialize reg ex for phone number.
	    String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
	    CharSequence inputStr = phoneNumber;
	    Pattern pattern = Pattern.compile(expression);
	    Matcher matcher = pattern.matcher(inputStr);
	    return matcher.matches();
	}
	
}
