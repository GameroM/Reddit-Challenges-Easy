// Create a random password generator!
// Specify the number of passwords to generate
// Allow the user to specify the length of the passwords to generate

package reddit_easy;

import java.util.Scanner;
import java.util.Random;

public class Challenge4 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		Random randi = new Random();
		
		System.out.println("Welcome to a password generator!");
		String[] array1 = {"a","b","c","d","e","f","g","1","2","3","4","5","6","7","*","#","^","&"};
		
		System.out.println("How many passwords would you like to generate? ");
		System.out.print(">> ");
		int usernum = userin.nextInt();
		
		System.out.println("How long would you like the passwords to be, (minimum 6 - 12 characters) ");
		System.out.print(">> ");
		int userlen = userin.nextInt();
		System.out.println();
		if(userlen >= 6 && userlen <= 12) {
		System.out.println("The passwords generated are: ");
		for(int counter2 = 0; counter2<usernum;counter2++) {
			for(int counter = 0;counter<userlen;counter++) {
				
				String pass = array1[randi.nextInt(array1.length)];	// array1.length works to make sure you use the whole array, the return
																	// values will all be the length from 0-x. In this case x is array1.length
				System.out.print(pass);
				
			
		}
			System.out.println();
		}
		}else {System.out.println("Invalid length input, please try again.");}
		userin.close();
	}
}
