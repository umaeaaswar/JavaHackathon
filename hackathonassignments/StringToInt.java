//Q21. WJP to convert string to int

package hackathonassignments;
import java.util.Scanner;
public class StringToInt {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number as a string: ");
	        String input = scanner.nextLine();
	        try {
	            int number = Integer.parseInt(input);//convert string into int
	            System.out.println("Converted integer: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter a valid integer.");
	        }

	        scanner.close();
	    }
	}


