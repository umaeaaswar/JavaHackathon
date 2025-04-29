
//Q28. WJP to find factorial of a number using recursion

package hackathonassignments;
import java.util.Scanner;
public class FactorialRecursive {
	    // Recursive method to calculate factorial
	    public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // base case
	        } else {
	            return n * factorial(n - 1); // recursive call//factorial(3)
	                                         //= 3 * factorial(2)
	            		                     //= 3 * (2 * factorial(1))
	            		                     //= 3 * (2 * 1)
	            		                     //= 6
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();

	        // Factorial must be non-negative
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long result = factorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        }

	        scanner.close();
	    }
	}


