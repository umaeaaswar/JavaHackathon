package hackathonassignments;
import java.util.Scanner;
public class PalindromeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string or number to check if it's a palindrome: ");
	        String input = scanner.nextLine();
	        input = input.toLowerCase();
	        // Reverse the input
	        String reversed = "";
	        System.out.println("Reversed string or number is:"+input);
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }
	        // Check if original and reversed are equal
	        if (input.equals(reversed)) {
	            System.out.println(input +" is a palindrome.");
	        } else {
	            System.out.println(input +"It is not a palindrome.");
	        }

	        scanner.close();
	    }
	
	        }
	        



