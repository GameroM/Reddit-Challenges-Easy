// Create a calculator application that has use in life. Make it do addition, subtracition, multiplication, division of two numbers.
// Make it so you choose what you want to do before you enter the two numbers with a menu and make it run until you give it the option to stop


package reddit_easy;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Greetings, what operation from the menu would you like to do?");
		int userchoice;
		do {
		System.out.println();
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) Quit");
		System.out.print(">>");
		userchoice = userin.nextInt();
		int numb1;
		int numb2;
		
	
		if(userchoice==1) {
			System.out.println("You have choosen option 1, Addition. ");
			System.out.println("Please enter first number: ");
			numb1 = userin.nextInt();
			System.out.println("Please enter second number: ");
			numb2 = userin.nextInt();
			System.out.println("The result is: " +add(numb1,numb2));
			
		}
		else if(userchoice==2) {
			System.out.println("You have choosen option 2, Subtraction. ");
			System.out.println("Please enter first number: ");
			numb1 = userin.nextInt();
			System.out.println("Please enter second number: ");
			numb2 = userin.nextInt();
			System.out.println("The result is: " +sub(numb1,numb2));
			
		}
		else if(userchoice==3) {
			System.out.println("You have choosen option 3, Multiplication. ");
			System.out.println("Please enter first number: ");
			numb1 = userin.nextInt();
			System.out.println("Please enter second number: ");
			numb2 = userin.nextInt();
			System.out.println("The result is: " +mult(numb1,numb2));
			
		}
		else if(userchoice==4) {
			System.out.println("You have choosen option 4, Division. ");
			System.out.println("Please enter first number: ");
			numb1 = userin.nextInt();
			System.out.println("Please enter second number: ");
			numb2 = userin.nextInt();
			System.out.println("The result is: " +div(numb1,numb2));
			
		}
		else if(userchoice==5) {
			System.out.println("You have chosen to quit. Goodbye");
		}
		}while(userchoice!=5);
		
		userin.close();
	}
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int sub(int a,int b) {
		int result = a - b;
		return result;
	}
	public static int mult(int a,int b) {
		int result = a*b;
		return result;
	}
	public static int div(int a, int b) {
		int result = a/b;
		return result;
	}
}
