// Write a program which is password proteccted, and wont open unless the corecct user and password is given.
// The username we will use is Mario, and the password should be Password1.

package reddit_easy;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		System.out.print(">> ");
		String username = userin.next();
		if(username.equals("Mario")) {
			System.out.println("Please enter your password: ");
			System.out.print(">> ");
			String password = userin.next();
			if(password.equals("Password1")) {
				System.out.println("Congratulations Mario, you have entered your username and password correctly."
						+ "Welcome to the program! ");
			}else {
				System.out.println("WRONG PASSWORD");
			}
		}else {
			System.out.println("Wrong username");
		}
		userin.close();
	}
}
