package preparation.kit.warmup.challenges;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	// inicializa variaveis
        int i=0;
        long conta = 0;

        // conta numero de 'a' na string
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a')
            	conta++;
        }

        // encontra o numero de repetições e o resto da divisão
        long repeticoes = n/s.length();
        long resto = n%s.length();

        conta = repeticoes * conta;

        // conta o numero de caracteres 'a' na string resto e soma ao total (conta)
        for(i=0; i<resto; i++){
            if(s.charAt(i) == 'a')
            	conta++;
        }

        return conta;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}
