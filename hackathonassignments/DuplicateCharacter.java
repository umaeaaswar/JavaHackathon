
//Q18. WJP to display duplicate character in string
package hackathonassignments;
import java.util.Scanner;
public class DuplicateCharacter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        // Convert string to character array
	        char[] chars = input.toCharArray();
	        for (int i = 0; i < chars.length; i++) {
	            int count = 1;
	            if (chars[i] != '0') {
	                for (int j = i + 1; j < chars.length; j++) {
	                    if (chars[i] == chars[j]) {
	                        count++;
	                        chars[j] = '0'; 
	                    }
	                }

	                if (count > 1) {
	                    System.out.println("Duplicate characters are:"+chars[i]);
	                }
	            }
	        }

	        scanner.close();
	    }
	}


