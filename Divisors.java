/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int var1 = Integer.parseInt(args[0]);
      		for(int var2 = 1; var2 <= var1; ++var2) {
         	if (var1 % var2 == 0) {
            		System.out.println(var2);
         	}
      		}
	}
}
