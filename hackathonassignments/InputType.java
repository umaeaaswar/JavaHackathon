
//Q23. WJP to differentiate input as string, int or bool
package hackathonassignments;
import java.util.Scanner;
public class InputType {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter something: ");
	        String input = scanner.nextLine();
	        if (isInteger(input)) {
	            System.out.println("You entered an Integer.");
	        }
	        else if (isBoolean(input)) {
	            System.out.println("You entered a Boolean.");
	        }
	        else {
	            System.out.println("You entered a String.");
	        }

	        scanner.close();
	    }
// Method to check if input is an integer
public static boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

// Method to check if input is a boolean
public static boolean isBoolean(String str) {
    return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
}
}