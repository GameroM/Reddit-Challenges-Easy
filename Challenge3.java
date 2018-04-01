// Wreite a program that can encrypt texts with an alphabetical caeser cipher. This cipher can ignore numbers, symbols, and whitespace.

package reddit_easy;

import java.util.Scanner;

public class Challenge3 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please enter the message you want to encrypt.");
		System.out.print(">> ");
		
		String message = userin.nextLine();
		System.out.print("The message encrypted comes out to be: ");
		for(int counter = 0; counter<message.length();counter++) {
			//System.out.print(message.charAt(counter));
			char x = message.charAt(counter);
			int ascii = (int) x;
			int ceaserconv = ascii+4;
			char convmessage =(char) ceaserconv;
			
			System.out.print(convmessage);
			
		}
		
		
		System.out.println("\n\nWould you like to decrpt the message? (y or n)");
		System.out.print(">> ");
		String choicedec = userin.next();
		if(choicedec.equals("y")) {
			System.out.println("The decrpyted message is: "+message);
		}
		else if(choicedec.equals("n")) {
			System.out.println("YOu have chosen not to decrypt, Goodbye.");
		}
		
		userin.close();
	}
	
	
}
