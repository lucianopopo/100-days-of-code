package preparation.kit.warmup.challenges;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {
	
	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int n, int[] c) {
    	int count = 0;
        int i = 0;
        while(i< n-1) {
            if (i< n-2 && c[i+2]==0) {
                i++;
            }
            if(i != n - 1) {
                count++;
            }
            i++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(n , c);

        System.out.println(result);

        scanner.close();
    }
}

/* 
 * 
 * Hi, The logic here is based on finding out the minimum number of jumps that are required to reach the last cloud Cn-1. 
 * Since there are 'n. elements in the array and she starts at C[0], we need to loop (while loop in this case) 
 * through until the index ( initialized at 0) reaches n-1 to avoid out of bound error. 
 * 
 * To minimize the number of jumps, ideally she should jump two clouds at a time before reaching the destination Cn-1 cloud. 
 * However in jumping two clouds at a time, she should not, by mistake land on a thunder cloud. 
 * A thunder cloud is an element with a value of 1 assigned to it. 
 * 
 * So with the ' if ' statement we check if every alternate cloud 
 * (skipping the adjacent cloud) is not a thunder cloud i.e. C[index +2] !== 1. 
 * 
 * Also the ' if ' statement checks if the current jump does result in jumping over the very last cloud Cn 
 * if that happens to be an adjacent cloud. If these two conditions are met, then a jump skipping the adjacent cloud 
 * and landing on the one next to it is made.
 * 
 * To signify this permitted 'double jump, the index is advanced by +2. 
 * The number of jumps incremented by one. If either one of the conditions are not met (the else clause), 
 * only a single jump is made with her landing on the adjacent cloud. So the index is incremented by just 1 and the number of jumps 
 * incremented by one.
 * 
 * When the while loop comes to an end, number of jumps made is returned by the function.
 * 
 *  
*/
