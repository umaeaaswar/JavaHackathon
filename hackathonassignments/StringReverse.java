
//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
package hackathonassignments;
import java.util.Scanner;
public class StringReverse {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        // Print the reversed string
	        System.out.print("Reversed string: ");
	        for (int i = input.length() - 1; i >= 0; i--) {
	            System.out.print(input.charAt(i));
	        }

	        scanner.close();
	    }
	}

