package thirty.days.of.code;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Day02Operators {
	// Complete the solve function below.
    static double solve(double meal_cost, int tip_percent, int tax_percent) {
        DecimalFormat formato = new DecimalFormat("#.##");      
        double total_cost = 0.0;
        double tip = Double.valueOf(formato.format(meal_cost * (((double) tip_percent) / 100)));
        double tax = Double.valueOf(formato.format(meal_cost * (((double) tax_percent) / 100)));
        total_cost = meal_cost + tip + tax;
        return total_cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double custoTotal = 0.0;
        custoTotal = solve(meal_cost, tip_percent, tax_percent);
        System.out.println((int) Math.round(custoTotal));

        scanner.close();
    }
}
