
//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, which when added give N.    
//INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4

package hackathonassignments;
import java.util.Scanner;
public class ConsecutiveSum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive natural number (N): ");
	        int N = scanner.nextInt();
	        System.out.println("Consecutive number combinations that sum to " + N + ":");
	     // Loop to try all possible starting points for sequences
	        for (int start = 1; start < N; start++) {
	            int sum = 0;//To keep track of the running total of the sequence.
	            int num = start;//Used to go from start to the next consecutive numbers.
	            StringBuilder combination = new StringBuilder();//To store the numbers in the format like "2 + 3 + 4" for printing.

	            // Keep adding consecutive numbers until sum >= N
	            while (sum < N) {
	                sum += num;//Adding the current number to the sum.
	                combination.append(num).append(" + ");                 //Appending that number to the combination string.
	                                         //Moving to the next number (num++)  
	                num++;
	            }

	            // If we found a valid combination
	            if (sum == N) {
	                // Remove the last " + "
	                combination.setLength(combination.length() - 3);//trims " + "//It removes the last " + " (which is 3 characters), so the string ends cleanly:
	                System.out.println(combination);  //combination.length()--Gets current length of string               //2+3+4+
	            }
	        }

	        scanner.close();
	    }
	}

