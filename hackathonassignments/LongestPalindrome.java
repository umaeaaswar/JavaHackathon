
//Q30. Write a function to find out longest palindrome in a given string?
package hackathonassignments;
import java.util.Scanner;
public class LongestPalindrome {
	    // Function to check if a string is a palindrome
	    public static boolean isPalindrome(String s) {
	        int start = 0, end = s.length() - 1;
	        
	        // Compare characters from start and end
	        while (start < end) {
	            if (s.charAt(start) != s.charAt(end)) {
	                return false; // Not a palindrome if any characters don't match
	            }
	            start++;
	            end--;
	        }
	        return true; // It's a palindrome
	    }

	    // Function to find the longest palindrome
	    public static String longestPalindrome(String s) {
	        String longest = "";
	        // Iterate through all substrings of s
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i + 1; j <= s.length(); j++) {
	                String substring = s.substring(i, j);
	                // Check if this substring is a palindrome
	                if (isPalindrome(substring) && substring.length() > longest.length()) {
	                    longest = substring; // Update longest palindrome
	                }
	            }
	        }
	        return longest; // Return the longest palindrome found
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        // Find and print the longest palindrome
	        String result = longestPalindrome(input);
	        System.out.println("Longest palindrome in the given string is: " + result);

	        scanner.close();
	    }
	}



