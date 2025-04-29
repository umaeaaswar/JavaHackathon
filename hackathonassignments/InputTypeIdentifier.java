

package hackathonassignments;
import java.util.Scanner;
	public class InputTypeIdentifier {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter something: ");
	        String input = scanner.nextLine();

	        // Try to parse as Integer
	        try {
	            int intValue = Integer.parseInt(input);
	            System.out.println("Input is of type: Integer");
	            return;
	        } catch (NumberFormatException e) {
	            // Not an integer
	        }

	        // Try to parse as Boolean
	        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
	            System.out.println("Input is of type: Boolean");
	        } else {
	            System.out.println("Input is of type: String");
	        }

	        scanner.close();
	    }
	}


