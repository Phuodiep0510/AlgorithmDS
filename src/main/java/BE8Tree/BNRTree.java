package BE8Tree;

import java.util.ArrayList;

public class BNRTree {
    Be8Node root;
    ArrayList<Be8Node> unbalancedNodes = new ArrayList<>();

    public BNRTree() {
        this.root = new Be8Node(1);

        root.left = new Be8Node(2);
        root.right = new Be8Node(3);

        root.left.left = new Be8Node(4);
        root.left.right = new Be8Node(5);

        root.left.left.left = new Be8Node(6);
        root.left.left.right = new Be8Node(7);

        root.left.left.left.left = new Be8Node(8);
    }

 
    public boolean isBalance() {
        unbalancedNodes.clear();
        checkHeight(root);
        return unbalancedNodes.isEmpty(); 
    }

  
    private int checkHeight(Be8Node node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        int right = checkHeight(node.right);

        int currentHeight = Math.max(left, right) + 1;

        if (Math.abs(left - right) > 1) {
            unbalancedNodes.add(node);
        }

        return currentHeight;
    }

  
    public ArrayList<Be8Node> findImBalanceNodes() {
        unbalancedNodes.clear();
        checkHeight(root);
        return unbalancedNodes;
    }
}
