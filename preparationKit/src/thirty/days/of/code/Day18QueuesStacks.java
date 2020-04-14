package thirty.days.of.code;

import java.util.LinkedList;
import java.util.Scanner;

public class Day18QueuesStacks {

    LinkedList filaChar;
    LinkedList pilhaChar;

    public Day18QueuesStacks() {
        filaChar = new LinkedList();
        pilhaChar = new LinkedList();
    }
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesStacks p = new Day18QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    // desenfileirar
    private char dequeueCharacter() {
        return (char) filaChar.remove(0);
    }

    private char popCharacter() {
        return (char) pilhaChar.remove(0);
    }

    // enfielirar
    private void enqueueCharacter(char c) {
        filaChar.addLast(c);
    }

    private void pushCharacter(char c) {
        pilhaChar.addFirst(c);
    }
}
