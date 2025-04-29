//Given a string print the unique words of the string

package hackathonassignments;
import java.util.Scanner;
public class UniqueStringWord {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        System.out.println("Unique words are:");
	        for (int i = 0; i < words.length; i++) {
	            int count = 0;
	            for (int j = 0; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                }
	            }
	                    boolean alreadyPrinted = false;
	                    for (int k = 0; k < i; k++) {
	                        if (words[i].equals(words[k])) {
	                            alreadyPrinted = true;
	                            break;
	                        }
	                    }

	                    if (count == 1 && !alreadyPrinted) {
	                        System.out.println(words[i]);
	                    }
	                }

	                scanner.close();
	            
	            }  
}
	    
	    