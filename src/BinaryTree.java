/*
*@author: Eduardo Ramírez #19946
*Algoritmos y estructuras de datos
*HDT7
*/
import java.io.*;

public class BinaryTree{
	Node root;

	private void addToTree(Node parent, Node child){ //metodo recursivo para ingreso de datos a los nodos del arbol

		if(parent == null){

			root = child;
			return;

		}else if (child.value < parent.value) {

			if(parent.left == null){

				parent.left = child;
				return;
			}
			else{
				addToTree(parent.left, child);
			}
		}
		else if(child.value > parent.value){

			if(parent.right == null){

				parent.right = child;
				return;
			}
			else{
				addToTree(parent.right, child);
			}
		}	
	}	


	public void addNode(int data){

		Node newNode = new Node(data);
		addToTree(root, newNode);

		return;

	}

	public void traverseInOrder(Node node) throws InterruptedException {

		if (node != null) {
				
			traverseInOrder(node.left);
			System.out.print(" "+node.value);
			traverseInOrder(node.right);
		}
	}
}
/*
class Node {
	
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
*/