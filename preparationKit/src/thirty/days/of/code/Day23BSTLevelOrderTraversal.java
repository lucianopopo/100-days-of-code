package thirty.days.of.code;
import java.util.*;
import java.io.*;
class Node3{
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day23BSTLevelOrderTraversal {
    static void levelOrder(Node3 root){
        // cria uma lista de nodes e adiciona o root
        Queue<Node3> listaNode = new LinkedList();
        listaNode.add(root);

        // percorre a lista de node
        while(!listaNode.isEmpty()){
            // pega o node atual e imprime o valor (nodeAtual.data)
            Node3 nodeAtual = listaNode.remove();
            System.out.print(nodeAtual.data + " ");
            // testa se o node atual tem galho (esquerdo e direito), se tiver adiciona à lista
            if (nodeAtual.left!=null) {
                listaNode.add(nodeAtual.left);
            }
            if (nodeAtual.right!=null) {
                listaNode.add(nodeAtual.right);
            }
        }
    }

    public static Node3 insert(Node3 root,int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
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
        Node3 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
