// Write a program that will print the song "99 bottles of beer on the wall"

package reddit_easy;

public class Challenge8 {
	public static void main(String[] args) {
		int bottles = 99;
		for(int counter = 0;counter<99;counter++) {
			
			System.out.println(bottles + " bottles of beer on the wall, "+bottles+" bottles of beer.. Take one down and pass "
					+ "it around, "+(bottles-1)+" bottles of beer on the wall");
			bottles--;
		}
	}
}
