
//Q32. You are given two sorted arrays, A and B, and 
//A has a large enough buffer at the end to hold B. 
//Write a method to merge B into A in sorted order.  
package hackathonassignments;
import java.util.Scanner;
public class MethodMergeSortedArray {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;            // last element in A's valid portion
        int j = n - 1;            // last element in B
        int k = m + n - 1;        // last position in A (including buffer)

        while (j >= 0) {
            if (i >= 0 && A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get size of A's actual data and B
        System.out.print("Enter number of elements in A (without buffer): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of elements in B: ");
        int n = scanner.nextInt();
        int[] A = new int[m + n];  // total size includes buffer
        int[] B = new int[n];
        System.out.println("Enter sorted elements of A:");
        for (int i = 0; i < m; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter sorted elements of B:");
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        merge(A, m, B, n);
        System.out.print("Merged array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
