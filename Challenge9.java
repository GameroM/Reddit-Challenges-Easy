// Write a program that will allow the user to input digits, and arrange them in numerical order

package reddit_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Challenge9 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		
		System.out.println("How many digits would you like to enter? ");
		
		int userlen = userin.nextInt();
		
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		int usernum;
		System.out.println("Start entering your digits: ");
		for(int counter = 0;counter<userlen;counter++) {
			System.out.print(">> ");
			usernum = userin.nextInt();
			mylist.add(usernum);
			
		}
		System.out.println(mylist);
		Collections.sort(mylist);
		System.out.println(mylist);
		userin.close();
		
		
		
		}
}
