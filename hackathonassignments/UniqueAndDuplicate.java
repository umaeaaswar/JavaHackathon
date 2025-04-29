

//Q5.	Given an array prints the unique numbers and also 
//print the number of occurrences of duplicate numbers.
package hackathonassignments;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueAndDuplicate {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of Array Elements:");
		int n=scanner.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter " + n + " numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("Enterd Array is:"+Arrays.toString(arr));
		System.out.println("Unique numbers are:");
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
			
		}
		boolean[] counted = new boolean[n];
        System.out.println("\nDuplicate numbers and their counts:");
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println(arr[i] + " occurred " + count + " times");
                }
            }
        }

        scanner.close();
    }
	}


