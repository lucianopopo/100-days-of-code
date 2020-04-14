package preparation.kit.arrays;

import java.io.IOException;
import java.util.Scanner;

public class ArraysLeftRotation {
	// Versão não otimizada
//    static int[] rotLeft(int[] a, int d) {
//    	int[] tempArray = a;
//    	for(int i = 0; i < d; i++) {
//    		tempArray = rotacionaArray(tempArray);
//    	}
//    	return tempArray;
//    }
//    
//    static int[] rotacionaArray(int[] a) {
//    	int[] tempArray = new int[a.length];
//		for(int i = 1; i < a.length; i++) {
//			tempArray[i - 1] = a[i];
//		}
//		tempArray[a.length - 1] = a[0];
//		
//    	return tempArray;
//    }

	// versão otimizada
	static int[] rotLeft(int[] a, int d) {
		int[] tempArray = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int position = Math.abs((i + (a.length - d)) % a.length);
			tempArray[position] = a[i];
		}
		return tempArray;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.print(String.valueOf(result[i]));
			// bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.print(" ");
				// bufferedWriter.write(" ");
			}
		}

		System.out.println(" ");
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
