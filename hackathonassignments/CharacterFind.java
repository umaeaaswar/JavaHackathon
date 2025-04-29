
//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
package hackathonassignments;
import java.util.Scanner;
public class CharacterFind {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int digitCount = 0;
	        int upperCaseCount = 0;
	        int lowerCaseCount = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isDigit(ch)) {
	                digitCount++;
	            } else if (Character.isUpperCase(ch)) {
	                upperCaseCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCaseCount++;
	            }
	        }
	        System.out.println("Number of digits: " + digitCount);
	        System.out.println("Number of uppercase letters: " + upperCaseCount);
	        System.out.println("Number of lowercase letters: " + lowerCaseCount);
	        scanner.close();
	    }
	}



