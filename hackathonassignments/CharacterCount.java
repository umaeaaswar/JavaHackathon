
//Q19. WJP to display number of occurrence of all character
package hackathonassignments;
import java.util.Scanner;
	public class CharacterCount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        char[] chars = input.toCharArray();
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == '\0') {//skip
	                continue;
	            }
	            int count = 1;//count char
	            // Compare the current character with the remaining characters in the string
	            for (int j = i + 1; j < chars.length; j++) {
	                if (chars[i] == chars[j]) {
	                    count++; 
	                    chars[j] = '\0';  // Mark the character as counted
	                }
	            }
	            System.out.println(chars[i] + ": " + count);
	        }
	        scanner.close();
	    }
	}


