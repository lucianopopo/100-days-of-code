package thirty.days.of.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day14Scope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
	
	private int[] elements;
  	public int maximumDifference;
	
  	public Difference(int[] elements) {
		super();
		this.elements = elements;
	}
  	
	public void computeDifference() {
		maximumDifference = 0;
        List<Integer> diferenca = new ArrayList<Integer>();
        for(int i=0; i < elements.length - 1; i++) {
            for(int j = 1; j < elements.length; j++) {
            	diferenca.add(Math.abs(elements[i] - elements[j]));
            }
        }
        maximumDifference = Collections.max(diferenca);
	}


}