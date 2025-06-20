package BE8Tree;

import java.util.ArrayList;
import java.util.List;



public class Node {
	int value;
	List<Node> children;
	
	Node(int value) {
		this.value = value;
		this.children = new ArrayList<>();
	}
	
	void addChildren(Node child) {
		children.add(child);
	}
}
