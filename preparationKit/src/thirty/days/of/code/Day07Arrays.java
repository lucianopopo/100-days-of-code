package thirty.days.of.code;

import java.util.Scanner;

public class Day07Arrays {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        String linha = "";
        for(int j = n - 1; j >= 0; j--) {
        	linha += arr[j] + " ";
        }
        
        System.out.println(linha);
        scanner.close();
    }
}
