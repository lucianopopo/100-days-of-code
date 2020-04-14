package thirty.days.of.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Day06Review {
	
	static void printString(int n, ArrayList<String> lista) {
		for(String s: lista) {
			char[] c = s.toCharArray();
			String par = "";
			String impar = "";
			for(int i=0 ; i < c.length ; i++){
	           if(i%2==0) {
	        	   par = par + c[i];
	           } else {
	        	   impar = impar + c[i];
	           }
	        }
			System.out.println(par + " " + impar);
		}
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int count=1; count <= n; count ++) {
        	lista.add(scanner.nextLine()); 
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }

        printString(n, lista);

        scanner.close();
	}
}
