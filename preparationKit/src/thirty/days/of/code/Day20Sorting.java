package thirty.days.of.code;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20Sorting {

    public static void main(String[] args) {
        int numSwaps = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        // faz um loop do ultimo índice não sorteado até 0, decrescente
        for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // faz um loop de 0 até o ultimo índice não sorteado (considereando que esse indice diminui a cada loop externo
            for (int i = 0; i < lastUnsortedIndex; i++) {
                // testa se o elemento é maior que o próximo elemento
                if (a[i] > a[i + 1]) {
                    // se for maior, chama o método que faz a troca de posição
                    troca(a, i, i + 1);
                    // acresce a contagem de trocas
                    numSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in "+ numSwaps +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

    // método que faz a troca de posição no array
    public static void troca(int[] array, int i, int j) {
        if (i == j) {return;}
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
