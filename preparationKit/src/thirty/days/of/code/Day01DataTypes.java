package thirty.days.of.code;

import java.util.Scanner;

public class Day01DataTypes {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        /* Declare second integer, double, and String variables. */
        int var1 = 0;
        double var2 = 0.0;
        String var3 = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        var1 = scan.nextInt();
        var2 = scan.nextDouble();
        var3 = scan.nextLine();
        var3 = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(var1+i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(var2+d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        
        System.out.println(s+var3);

        scan.close();
    }
}
