//Q26. WJP to merge two sorted array.(Do not use third array)		
//array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		
//After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
package hackathonassignments;
import java.util.Scanner;
public class MergeSortedArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] array1 = new int[10]; // Contains first 6 elements + 4 empty spots
	        int[] array2 = new int[4];
	        int m = 6; // number of actual elements in array1
	        int n = 4; // number of elements in array2
	        System.out.println("Enter 6 sorted elements for array1:");
	        for (int i = 0; i < m; i++) {
	            array1[i] = scanner.nextInt();
	        }

	        System.out.println("Enter 4 sorted elements for array2:");
	        for (int i = 0; i < n; i++) {
	            array2[i] = scanner.nextInt();
	        }

	        // Merge array2 into array1 starting from the back
	        int i = m - 1;          // Last valid element in array1// points to last actual element in array1 (index 5)
	        int j = n - 1;          // Last element in array2// points to last element in array2 (index 3)
	        int k = m + n - 1;      // End of array1// points to last slot in array1 (index 9)
	        while (i >= 0 && j >= 0) {//If array1[i] > array2[j], we place array1[i] at the end of array1[k], then move i-- and k--.
	        //	Else, we place array2[j] at array1[k], then move j-- and k--.
	            if (array1[i] > array2[j]) {
	                array1[k--] = array1[i--];
	            } else {
	                array1[k--] = array2[j--];
	            }
	        }

	        // If any elements left in array2, copy them
	        while (j >= 0) {
	            array1[k--] = array2[j--];
	        }

	        // Output merged array1
	        System.out.println("Merged array:");
	        for (int x : array1) {
	            System.out.print(x + " ");
	        }

	        scanner.close();
	    }
	}



