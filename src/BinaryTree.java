public class BinaryTree{

	Node root;

	String str1 = "house, casa";
	String str2 = "dog, perro";
	String str3 = "homework, tarea";
	String str4 = "woman, mujer";
	String str5 = "town, pueblo";
	String str6 = "yes, si";

	int var1 = str1.compareTo(str1); //devuelve cero y lo uso como raiz de mi arbol
	int var2 = str2.compareTo(str1); //deberia devolver un numero menor a str1 por lo tanto va a la izquierda
	int var3 = str3.compareTo(str2); //deberia devolver que str3 es mayor que str2 por lo tanto va a la derecha y por debajo de str2
	int var4 = str4.compareTo(str1); //deberia devolver un numero mayor a str1 por lo tanto va a la derecha
	int var5 = str5.compareTo(str4); //deberia devolver que str5 es menor que str4 por lo tanto va a la izquierda
	int var6 = str6.compareTo(str4); //deberia devolver que str6 es mayor que str4 por lo tanto va a la derecha

	public void printer(){
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

	private Node addRecursive(Node current, int value){

		if(current == null){
			return new Node(value);
		}

		if(value < current.value){
			current.left = addRecursive(current.left, value);
		}else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		}else{
			//valor ya existe
			return current;
		}

		return current;
		
	}

	public void add(int value){

		root = addRecursive(root, value);

	}

	private BinaryTree createBinaryTree(){

		BinaryTree bt = new BinaryTree();

		bt.add(var1);
		bt.add(var2);
		bt.add(var3);
		bt.add(var4);
		bt.add(var5);
		bt.add(var6);

		return bt;
	}



}