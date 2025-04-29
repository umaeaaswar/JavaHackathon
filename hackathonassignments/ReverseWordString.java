
//Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)
package hackathonassignments;
import java.util.Scanner;
public class ReverseWordString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        for (int i = words.length - 1; i >= 0; i--) {
	            System.out.println (words[i]+ "" );
	        }

	        scanner.close();
	    }
	}


