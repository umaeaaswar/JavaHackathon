package hackathonassignments;
	import java.io.*;
	import java.util.*;
	public class ReverseFileLine {
	    public static void main(String[] args) {
	        // Input and output file names
	        String inputFile = "/Users/umaeaaswar/Documents/ReadFile.txt";
	        String outputFile = "";

	        List<String> lines = new ArrayList<>();

	        // Read all lines from input file
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                lines.add(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading input file: " + e.getMessage());
	            return;
	        }

	        // Write lines in reverse order to output file
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
	            for (int i = lines.size() - 1; i >= 0; i--) {
	                writer.write(lines.get(i));
	                writer.newLine(); // move to the next line
	            }
	        } catch (IOException e) {
	            System.out.println("Error writing to output file: " + e.getMessage());
	            return;
	        }

	        System.out.println("Lines reversed and written to " + outputFile);
	    }
	}


