package thirty.days.of.code;

import java.util.Scanner;

public class Day15LinkedList {
	
	public static Node insert(Node head, int data) {
        // testa se o head é nulo
        if(head == null) {
            return new Node(data);
        } else if(head.next == null) { // testa se o proximo é nulo
            head.next = new Node(data);
        } else {
            insert(head.next,data); // recursividade
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

class Node {
	int data;
	Node next;
	public Node(int d) {
        this.data = d;
        this.next = null;
    }
}