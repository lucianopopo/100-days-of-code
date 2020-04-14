package thirty.days.of.code;

import java.util.Scanner;

public class Day10BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int result = binario(n);
        System.out.println(result);
        
        scanner.close();
    }

	private static int binario(int n) {
		// converte um inteiro em base 2 (0 e 1) e retorna uma string
		String numeroBinario = Integer.toBinaryString(n);
		int contaUm = 0; 
		// array de strings formada com os grupos de numeros 1 na string binaria {11, 1, 111, 1} para o numero 1101011101
		String[] arrayStrings1 = numeroBinario.split("0");
		
		for(int i=0;i<arrayStrings1.length;i++ ){
        	// testa pra cada string de 1s no array, qual o de maior tamanho
            if (contaUm < arrayStrings1[i].length()) {contaUm = arrayStrings1[i].length();}
        }
		
		return contaUm;
	}
}
