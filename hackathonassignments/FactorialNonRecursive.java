
//Q2.	write a program to find factorial (Non Recursive)
package hackathonassignments;
import java.util.Scanner;

	public class FactorialNonRecursive {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();
	        if (number < 0) {
	            System.out.println("Factorial is not for negative numbers.");
	        } else {
	            int fact = 1;

	            for (int i = 1; i <= number; i++) {
	                fact =fact* i;
	            }

	            System.out.println("Factorial of " + number + " is: " + fact);
	        }

	        scanner.close();
	    }
	}


