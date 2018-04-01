// Write a program that can take a string and prints out all thepossible permutations of the string
// For example: "hi!" will print out: "hi!", "ih!", "!hi","h!i","i!h", etc, not necessarily in that order

package reddit_easy;

import java.util.Scanner;

public class Challenge12 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		System.out.print(">> ");
		String string1 = userin.next();
		
		permutation(string1);
		userin.close();
	}
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
