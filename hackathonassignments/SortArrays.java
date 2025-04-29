package hackathonassignments;
import java.util.Scanner;
import java.util.Arrays;

public class SortArrays {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();
	        int[] numbers = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        System.out.println("The original Array is:"+Arrays.toString(numbers));
	        // Sort the array
	        Arrays.sort(numbers);
	        System.out.println("The Sorted Array is: " + Arrays.toString(numbers));

	        scanner.close();
	    }
	}


