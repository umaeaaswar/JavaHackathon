
//Q1.	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 
package hackathonassignments;
import java.util.Scanner;
public class BooleanTwoTrue {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter value for a (true/false): ");
	        boolean a = scanner.nextBoolean();
	        System.out.print("Enter value for b (true/false): ");
	        boolean b = scanner.nextBoolean();
	        System.out.print("Enter value for c (true/false): ");
	        boolean c = scanner.nextBoolean();
	        boolean atLeastTwoTrue = (a && b) || (a && c) || (b && c);
	        if (atLeastTwoTrue) {
	            System.out.println("At least two of the values are true.");
	        } else {
	            System.out.println("Less than two values are true.");
	        }

	        scanner.close();
	    }
	}


