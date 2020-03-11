public class BinaryTree{

	Node root;

	private Node addRecursive(Node current, String word){
		if(current == null){
			return new Node(word);
		}

		if(word.compareTo(current.word)){
			current.left = addRecursive(current.left, word);
			
		}
	}
}