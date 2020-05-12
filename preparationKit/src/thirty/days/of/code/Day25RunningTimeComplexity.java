package thirty.days.of.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day25RunningTimeComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> lista = new ArrayList();
        for(int i = 0; i < n; i++){
            int numero = scanner.nextInt();
            String resultado = testaPrimo(numero) ? "Prime" : "Not prime";
            lista.add(resultado);
        }
        for(String s : lista){
            System.out.println(s);
        }
        scanner.close();
    }

    private static boolean testaPrimo(int numero) {
        if(numero == 1){
            return false;
        }
        if(numero == 2){
            return true;
        }
        for (int i = 2; i*i<=numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
