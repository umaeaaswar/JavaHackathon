

package hackathonassignments;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPalindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.println("Enterd Array is"+Arrays.toString(arr));
	        boolean isPalindrome = true;
	        for (int i = 0; i < n / 2; i++) {
	            if (arr[i] != arr[n - 1 - i]) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        if (isPalindrome) {
	            System.out.println("The array is a palindrome.");
	        } else {
	            System.out.println("The array is not a palindrome.");
	        }

	        scanner.close();
	    }
	}


