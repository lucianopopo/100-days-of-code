package thirty.days.of.code;

import java.util.Scanner;

public class Day00HelloWorld {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scanner.nextLine(); 

		// Close the scanner object, because we've finished reading 
	    // all of the input from stdin needed for this challenge.
		scanner.close(); 
	  
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
	  
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	    System.out.println(inputString);
	}
}
