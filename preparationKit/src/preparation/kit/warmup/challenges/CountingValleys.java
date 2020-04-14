package preparation.kit.warmup.challenges;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int vales = 0;     
        int nivel = 0;   
        for(char c : s.toCharArray()){
            if(c == 'U') ++nivel;
            if(c == 'D') --nivel;
            if(nivel == 0 && c == 'U') ++vales;
        }
        return vales;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println("resultado: " + result);

        scanner.close();
    }
}
