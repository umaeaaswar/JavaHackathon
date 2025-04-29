//Q6.	WJP to perform ascending order Selection  sort

package hackathonassignments;
import java.util.Arrays;
import java.util.Scanner;
public class AscendingSort {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter"  +  n  +  "Elements:");
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enterd Array is"+Arrays.toString(arr));
		for (int i = 0; i < n - 1; i++) {
			int minIndex=i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                	minIndex=j;
                }
            }
            //swap
          
                  int temp = arr[i];
                  arr[i] = arr[minIndex];
                   arr[minIndex] = temp;
        }
            
		System.out.print("The Ascending Array is:"+Arrays.toString(arr) );
          for (int i = 0; i < n; i++) {
           
        }

        scanner.close();
    }
		}
	

		




 