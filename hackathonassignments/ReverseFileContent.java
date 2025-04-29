
//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
package hackathonassignments;
import java.io.*;
import java.util.*;
public class ReverseFileContent {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for file name input from the user
	        System.out.print("Enter the source file name: ");
	        String inputFile = scanner.nextLine();
	        
	        System.out.print("Enter the destination file name: ");
	        String outputFile = scanner.nextLine();

	        try {
	            // Reading the file content into a list
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            List<String> lines = new ArrayList<>();
	            String line;

	            // Read each line and store it in the list
	            while ((line = reader.readLine()) != null) {
	                lines.add(line);
	            }
	            reader.close();  // Close the reader after reading

	            // Reverse the list of lines
	            Collections.reverse(lines);

	            // Writing the reversed lines into the new file
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
	            for (String reversedLine : lines) {
	                writer.write(reversedLine);
	                writer.newLine();  // Write each line with a new line
	            }
	            writer.close();  // Close the writer after writing

	            System.out.println("File has been reversed and saved to: " + outputFile);

	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}

