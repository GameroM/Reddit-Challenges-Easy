// Find the number of the year for the given dat. For example, january 1st would be 1 and december 31st would be 365.

package reddit_easy;

import java.util.Scanner;

public class Challenge13 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please enter the month: ");
		System.out.print(">> ");
		String usermonth = userin.next();
		
		System.out.println("Plese enter the day of the month: ");
		System.out.print(">>");
		int userday = userin.nextInt();
		
		userin.close();
		
		int x = getnum(getmonth(usermonth),userday);
		System.out.println("The day of the year is number: "+x);
	}
	
	public static int getmonth(String month) {
		int x = 0;
		if(month.equals("January")) {
			x = 0;
		}
		else if(month.equals("February")) {
			x = 31;
		}
		else if(month.equals("March")) {
			x = 59;
		}
		else if(month.equals("April")) {
			x = 90;
		}
		else if(month.equals("May")) {
			x = 120;
		}
		else if(month.equals("June")) {
			x = 151;
		}
		else if(month.equals("July")) {
			x = 181;
		}
		else if(month.equals("August")) {
			x = 212;
		}
		else if(month.equals("September")) {
			x = 243;
		}
		else if(month.equals("October")) {
			x = 273;
		}
		else if(month.equals("November")) {
			x = 304;
		}
		else if(month.equals("December")) {
			x = 334;
		}
		return x;
	}
	
	
	
	public static int getnum(int month, int day) {
		int daynum = month+day;
		return daynum;
	}
}
