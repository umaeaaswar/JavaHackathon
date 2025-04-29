package hackathonassignments;
import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Character.toString(ch), "");
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char characterToRemove = scanner.next().charAt(0);
        // Call the method to remove the character
        String updatedString = removeCharacter(inputString, characterToRemove);
        System.out.println("Updated string: " + updatedString);
        scanner.close();
    }
}


