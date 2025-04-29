
//Pick a pivot element.
//Partition the array:
//Put all elements less than the pivot to its left
//Put all greater or equal elements to its right
//Recursively sort the left and right parts.
//ex:[8, 3, 1, 7, 0, 10, 2]
//Move all elements < 2 to the left
//Everything >= 2 stays on the right

package hackathonassignments;
import java.util.Scanner;
public class QuickSort {
	    // Quick Sort method
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Find quicksort index
	            int quicksortIndex = partition(arr, low, high);

	            // Recursively sort left and right parts
	            quickSort(arr, low, quicksortIndex - 1);
	            quickSort(arr, quicksortIndex + 1, high);
	        }
	    }
	    // Partition method to place pivot at correct position
	    public static int partition(int[] arr, int low, int high) {
	        int quicksortIndex= arr[high];  // quicksorIndex element
	        int i = low - 1;        // Index of smaller element

	        for (int j = low; j < high; j++) {
	            if (arr[j] < quicksortIndex) {
	                i++;
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        // Swap quicksortIndex to its correct place
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;  // Return quicksort index
	    }
	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        // Sort the array using quick sort
	        quickSort(arr, 0, n - 1);
	        // Print the sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}



