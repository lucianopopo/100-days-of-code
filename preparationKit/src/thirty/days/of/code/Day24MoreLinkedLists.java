package thirty.days.of.code;
import java.util.*;
public class Day24MoreLinkedLists {
    public static Node4 removeDuplicates(Node4 head) {
        //Write your code here
        // Hashset grava os valores
        HashSet<Integer> hs = new HashSet<>();
        /* pega cada um dos elementos */
        Node4 atual = head;
        Node4 anterior = null;
        while (atual != null)
        {
            // guarda o valor atual
            int valorAtual = atual.data;
            // Se o valor atual já foi visto antes
            if (hs.contains(valorAtual)) {
                // a referencia do nó anterior passa a ser da atual
                anterior.next = atual.next;
            } else {
                // senão, adiciona o valor atual ao hashset
                hs.add(valorAtual);
                // e o nó anterior passa a ser o atual
                anterior = atual;
            }
            // e o nó atual passa a ser o próximo
            atual = atual.next;
        }
        return head;
    }

    public static  Node4 insert(Node4 head,int data)
    {
        Node4 p=new Node4(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node4 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
    }
    public static void display(Node4 head)
    {
        Node4 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node4 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}



class Node4{
    int data;
    Node4 next;
    Node4(int d){
        data=d;
        next=null;
    }
}