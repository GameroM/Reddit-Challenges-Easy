package reddit_easy;

import java.util.Scanner;

public class Challenge11 {
	public static void main(String[] args) {
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please enter the month: ");
		System.out.print(">> ");
		String usermonth = userin.next();
		
		System.out.println("Please enter the day: ");
		System.out.print(">> ");
		int userday = userin.nextInt();
		
		System.out.println("Please enter the year: ");
		System.out.println(">> ");
		int useryear = userin.nextInt();
		
		int x =calc(useryear,usermonth,userday);
		System.out.print("The day of the week is: "+weekday(x));
	
	
		userin.close();
		
	}
	public static int getmonth(String month) {
		int x = 0;
		if(month.equals("March")){
			x =1;
		}
		else if(month.equals("April")) {
			x = 2;
		}
		else if(month.equals("May")) {
			x = 3;
		}
		else if(month.equals("June")) {
			x = 4;
		}
		else if(month.equals("July")) {
			x = 5;
		}
		else if(month.equals("August")) {
			x = 6;
		}
		else if(month.equals("September")) {
			x = 7;
		}
		else if(month.equals("October")) {
			x = 8;
		}
		else if(month.equals("November")) {
			x = 9;
		}
		else if(month.equals("December")) {
			x = 10;
		}
		else if(month.equals("January")) {
			x = 11;
		}
		else if(month.equals("February")) {
			x = 12;
		}
		return x;
		
	}
	public static int calc(int year, String month, int day) {
		// zeller's rule
		int k = day;
		int m = getmonth(month);
		
		int d = year % 100;
		if(m == 11 || m == 12) {
			d-=1;
		}
		
		int c = Integer.parseInt(String.valueOf(year).substring(0, 2));
		int f = k +((13*m-1)/5)+d+(d/4)+(c/4)-2*c;
		int result = f %7;
		
		return result;
		
	}
	
	public static String weekday(int day) {
		String x = null;
		if(day == 0) {
			x= "Sunday";
		}
		else if(day == 1) {
			x="Monday";
		}
		else if(day == 2) {
			x = "Tuesday";
		}
		else if(day == 3) {
			x="Wednesday";
		}
		else if(day == 4) {
			x = "Thursday";
		}
		else if(day == 5) {
			x = "Friday";
		}
		else if(day == 6) {
			x = "Saturday";
		}
		return x;
		
	}
}
