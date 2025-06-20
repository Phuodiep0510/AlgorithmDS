package BE8Tree;

public class Main {
	public static void main(String[] args) {
		Node root = new Node(1);
		
		Node child2 = new Node(2);
		Node child3 = new Node(3);
		root.addChildren(child2);
		root.addChildren(child3);
		
		child2.addChildren(new Node(4));
		child2.addChildren(new Node(5));
		child3.addChildren(new Node(6));
		
		printTree(root, 0);
	}
	
	public static void printTree (Node node, int level) {
		for (int i = 0; i < level; i++) 
			System.out.print(" ");
		System.out.println(node.value);
		
		for (Node child : node.children) {
			printTree(child, level + 1);
		}
	}
}

