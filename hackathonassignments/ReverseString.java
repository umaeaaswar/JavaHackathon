package hackathonassignments;
import java.util.Scanner;
public class ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();
	        System.out.print("Reversed string: ");
	        for (int i = inputString.length() - 1; i >= 0; i--) {
	            System.out.print(inputString.charAt(i));  // Print character by character in reverse
	        }
	        scanner.close();
	    }
	}



