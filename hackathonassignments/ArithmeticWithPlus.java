package hackathonassignments;
import java.util.Scanner;
public class ArithmeticWithPlus {
    // Main method with Scanner input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.println("a - b = " + subtract(a, b));//a+(-b)//Example: 10 - 3 → 10 + (-3) → 7
        System.out.println("a * b = " + multiply(a, b));//Multiplication is just adding a, b times.
                                                       //Example: 4 * 3 → 4 + 4 + 4 = 12
        System.out.println("a / b = " + divide(a, b));//We count how many times b can be added to itself before reaching or exceeding a.
                                                      //Example: 10 / 2//2 + 2 + 2 + 2 + 2 = 10 → 5 times → result = 5
        scanner.close();
    }

	    // Subtraction using only +
	    public static int subtract(int a, int b) {
	        // a - b is the same as a + (-b)
	        return a + negate(b);
	    }

	    // Multiplication using only +
	    public static int multiply(int a, int b) {
	        int result = 0;
	        // Handle negative numbers
	        boolean isNegative = false;
	        if (b < 0) {
	            b = negate(b);//Convert b to positive so we can loop easily
	            isNegative = true;
	        }

	        for (int i = 0; i < b; i++) {
	            result += a;
	        }
	        if (isNegative) {
	            return negate(result);
	        } else {
	            return result;
	        }

	        //return isNegative ? negate(result) : result;//ternary operator(if-else)
	    }

	    // Division using only +
	    public static int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero not allowed.");
	        }

	        boolean isNegative = false;

	        if (a < 0) {                 //a=5,b=2 ->a is negative so a=negate(-5)->5
	            a = negate(a);
	            isNegative = !isNegative;
	        }

	        if (b < 0) {
	            b = negate(b);
	            isNegative = !isNegative;
	        }

	        int result1 = 0;
	        int sum = 0;

	        while (sum + b <= a) {
	            sum += b;
	            result1++;
	        }
	        if (isNegative) {
	            return negate(result1);
	        } else {
	            return result1;
	        }

	        //return isNegative ? negate(quotient) : quotient;
	    }

	    // Helper to negate a number using only +// // Negates a number using only +
	     
	     public static int negate(int num) {
	        int neg = 0;
	       int delta = num < 0 ? 1 : -1;//f num is positive, we subtract by setting delta = -1
                                         //If num is negative, we add to it by setting delta = 1
	        while (num != 0) {
	            neg += delta;
	            num += delta;
	        }
//
	        return neg;
	    }

}