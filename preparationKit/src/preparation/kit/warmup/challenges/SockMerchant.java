package preparation.kit.warmup.challenges;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        HashSet<Integer> socks = new HashSet<>();
        for(int sock : ar)
            if(!socks.add(sock))
            {
                pairs++;
                socks.remove(sock);
            }             
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
