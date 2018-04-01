// Use a list/ array of elemtns and a block size k or some other choice 
// Output should be the elements with every block of k elements reversed starting form the beginnening of the list
// For example, with the list 12,24,32,44,55,66 and the block size of 2, the result is 24,12,44,32,66,55
package reddit_easy;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Challenge14 {
	public static void main(String[] args) {
		
		Scanner userin = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		/*
		for(int counter= 1; counter<7;counter++) {
			array1.add(counter);
			
		}
		*/
		
		System.out.println("Enter digits in, enter a 0 when you decide to finish the array");
		System.out.print(">> ");
		int usernums = userin.nextInt();
		while(usernums != 0) {
			array1.add(usernums);
			System.out.print(">> ");
			usernums = userin.nextInt();
			
		}
		
		
		System.out.print("The original array is: ");
		System.out.println(array1);
		/*
		System.out.println((array1.subList(0, 2)));
		Collections.reverse(array1.subList(0,2));
		System.out.println((array1.subList(0, 2)));
		
		*/
		System.out.println("Enter block size: ");
		System.out.print(">> ");
		int blocksize = userin.nextInt();
		userin.close();
		for(int counter = 0; counter<array1.size();counter+=blocksize) {
			Collections.reverse(array1.subList(counter, counter+blocksize));
			
		}
		
		System.out.println("The new modified array with a block size of "+ blocksize+" is: " +array1);
		
	}
}
