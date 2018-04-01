// create a program that will ask the users name, age, and reddit username. Have it tell them the information back, in the format
// Your name is " ", you are " " years old, and your username is blank.

package reddit_easy;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = userin.next();
		System.out.print("Enter age: ");
		String age = userin.next();
		System.out.print("Enter reddit username: ");
		String username = userin.next();
		System.out.println();
		System.out.println("Your name is "+name+", you are "+age+" years old, and your username is "+username);
		userin.close();
	}
}
