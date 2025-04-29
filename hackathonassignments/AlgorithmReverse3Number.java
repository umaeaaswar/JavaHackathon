//Q 62. write an algorithm to reverse first 3 numbers, 
//then next 3 numbers, then next 3 numbers, the number will be  based on var k. Array = [3,2,4,7,0,3,1,5,8, 4]       k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]

package hackathonassignments;
import java.util.Scanner;
public class AlgorithmReverse3Number {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Input: size of array
	        System.out.print("Enter size of array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        // Input: array elements
	        System.out.println("Enter " + size + " array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Input: k (group size)
	        System.out.print("Enter value of k: ");
	        int k = scanner.nextInt();
	        // Reverse every k elements
	        for (int i = 0; i < arr.length; i += k) {
	            int start = i;
	            int end = Math.min(i + k - 1, arr.length - 1);  // handle last group if smaller than k//Calculates the end index of the current group.
	            //i + k - 1 is the last element of the group.
	            // Reverse logic
	            while (start < end) {
	                int temp = arr[start];
	                arr[start] = arr[end];
	                arr[end] = temp;
	                start++;
	                end--;
	            }
	        }

	        // Output the result
	        System.out.print("Output: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}


