package preparation.kit.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2D {
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {  	
    	List<Integer> listaSomas = new ArrayList<>();
		for(int i = 0; i<4; i++) {
			for(int j=0; j < 4; j++) {
				int soma = 0;
				soma += arr[i][j];
				soma += arr[i][j+1];
				soma += arr[i][j+2];
				soma += arr[i+1][j+1];
				soma += arr[i+2][j];
				soma += arr[i+2][j+1];
				soma += arr[i+2][j+2];
				listaSomas.add(soma);
			}
		}
    	return retornaMaiorValor(listaSomas);
    }
    
    public static int retornaMaiorValor(List<Integer> numeros){
        int aux = -63; // valor mínimo de uma ampulheta
        for (int i = 0; i < numeros.size(); i ++){
            if (numeros.get(i) > aux){
                aux = numeros.get(i);
            }
        }
        return aux;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
