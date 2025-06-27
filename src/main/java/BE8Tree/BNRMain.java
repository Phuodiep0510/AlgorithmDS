package BE8Tree;

import java.util.ArrayList;

public class BNRMain {
public static void main(String[] args) {
	BNRTree tree = new BNRTree();
	
	boolean isBalanced = tree.isBalance();
	System.out.println("The tree is balanced? " + isBalanced);
	
	if (!isBalanced) {
		ArrayList<Be8Node> unbalancedNodes = tree.findImBalanceNodes();
        System.out.println("Unbalanced nodes:");
        for (Be8Node node : unbalancedNodes) {
            System.out.println(" - Node with value: " + node.value);
        }
	}
}
}
