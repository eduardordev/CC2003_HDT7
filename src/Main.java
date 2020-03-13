public class Main{

	public static void main(String[] args) {

		String str1 = "house, casa";
		String str2 = "dog, perro";
		String str3 = "homework, tarea";
		String str4 = "woman, mujer";
		String str5 = "town, pueblo";
		String str6 = "yes, si";

		int var1 = str1.compareTo(str1); //devuelve cero y lo uso como raiz de mi arbol
		int var2 = str2.compareTo(str1); //deberia devolver un numero menor a str1 por lo tanto va a la izquierda
		int var3 = str4.compareTo(str1); //deberia devolver un numero mayor a str1 por lo tanto va a la derecha
		int var4 = str3.compareTo(str2); //deberia devolver que str3 es mayor que str2 por lo tanto va a la derecha y por debajo de str2
		int var5 = str5.compareTo(str4); //deberia devolver que str5 es menor que str4 por lo tanto va a la izquierda
		int var6 = str6.compareTo(str4); //deberia devolver que str6 es mayor que str4 por lo tanto va a la derecha

		BinaryTree b = new BinaryTree();

		b.addNode(var1);
		b.addNode(var2);
		b.addNode(var3);
		b.addNode(var4);
		b.addNode(var5);
		b.addNode(var6);
		b.traverseInOrder(b.root);

		
	}
}