package thirty.days.of.code;
import java.util.*;

public class Day22BinarySearchTrees {

    public static int getHeight(Node22 root){
        // inicia as variáveis
        int alturaLeft = 0;
        int alturaRight = 0;
        if (root.left != null) {
            // se o galho esquerdo não for nulo, chama a propria função passando o galho como parametro e soma o retorno a mais 1
            alturaLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            // se o galho direito não for nulo, chama a propria função passando o galho como parametro e soma o retorno a mais 1
            alturaRight = getHeight(root.right) + 1;
        }
        // testa qual o galho maior e retorna o valor
        return (alturaLeft > alturaRight ? alturaLeft : alturaRight);
    }

    public static Node22 insert(Node22 root, int data){
        if(root==null){
            return new Node22(data);
        }
        else{
            Node22 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

class Node22 {
    Node22 left,right;
    int data;
    Node22(int data){
        this.data=data;
        left=right=null;
    }
}