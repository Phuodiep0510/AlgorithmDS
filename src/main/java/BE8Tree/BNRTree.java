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
        root.left.left.left.right = new Be8Node(9);
        
        root.left.left.left.left.left = new Be8Node(10);
    }

    private int height(Be8Node node) {
    	if (node == null) return 0;
    	return 1 + Math.max(height(node.left), height(node.right));
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
        int balanceFactor = left - right;

        if (Math.abs(balanceFactor) > 1) {
            unbalancedNodes.add(node);
        }
        return 1 + Math.max(left, right);
    }
    public void rebalanceTree() {
        this.root = balance(root);
    }
    Be8Node balance(Be8Node node) {
        if (node == null) return null;
        node.left = balance(node.left);
        node.right = balance(node.right);
        int left = height(node.left);
        int right = height(node.right);
        int balanceFactor = left - right;
        
        if (balanceFactor > 1) {
        	if (height(node.left.left) > height(node.left.right)) {
        		return rotateRight(node);
        	} else {
        		node.left = rotateLeft(node.left);
        		return rotateRight(node);
        	}
        }
        if (balanceFactor < -1) {
        	if (height(node.right.right) > height(node.right.left)) {
        		return rotateLeft(node);
        	} else {
        		node.right = rotateRight(node.right);
        		return rotateLeft(node);
        	}
        }
        return node;
    }

        private Be8Node rotateRight(Be8Node y) {
            Be8Node x = y.left;
            Be8Node a2 = x.right;
            x.right = y;
            y.left = a2;
            return x;
        }
        private Be8Node rotateLeft(Be8Node x) {
            Be8Node y = x.right;
            Be8Node a2 = y.left;
            y.left = x;
            x.right = a2;
            return y;
        }

  
    public ArrayList<Be8Node> findImBalanceNodes() {
        unbalancedNodes.clear();
        checkHeight(root);
        return unbalancedNodes;
    }
}
