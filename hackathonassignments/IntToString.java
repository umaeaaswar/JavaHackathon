//Q22. WJP to convert int to string

package hackathonassignments;
import java.util.Scanner;
public class IntToString {
	    public static void main(String[] args) {
	    	Scanner scanner=new Scanner(System.in);
	    	System.out.print("Enter a number as an integer: ");
	        String input = scanner.nextLine();
	        String str = String.valueOf(input);

	        System.out.println("Converted String is: " + str);
	        scanner.close();
	    
	    }
	   
	}



