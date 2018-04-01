// This is an approximation of the 30 digits, not really works to find PI

package reddit_easy;

public class Challenge6a {
	public static void main(String[] args) {
		
		double result = pi1() - pi2();
		System.out.println("Pi to 30 digits is: "+result);
		
	}
	
	public static double pi1() {
		double suma = 0;
		for(double counter = 1; counter <62;counter+=4) {
			double x = 4/counter;
			//double suma= 0;
			suma +=x;
			
			
		}
		return suma;
	}
	public static double pi2() {
		double suma2 = 0;
		for(double counter = 3; counter <62;counter+=4) {
			double x = 4/counter;
			//double suma2 = 0;
			suma2+=x;
			
		}
		return suma2;
	}
}
