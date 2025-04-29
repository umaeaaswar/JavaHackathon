
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
package hackathonassignments;
import java.util.Scanner;
public class BinnarySearch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = new int[5];
	        System.out.println("Enter 5 sorted binary elements (0 or 1):");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the element to search (0 or 1): ");
	        int key = scanner.nextInt();
	        // Perform Binary Search
	        int result = binarySearch(arr, key);
	        if (result == -1) {
	            System.out.println("Element not found in the array.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }

	        scanner.close();
	    }

	    // Binary Search method
	    public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1; // not found
	    }
	}



