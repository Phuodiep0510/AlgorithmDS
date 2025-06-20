package BE8Tree;

import java.util.ArrayList;
import java.util.List;

public class DFSMain {
    public static void main(String[] args) {
        // Create nodes
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        // Build tree
        root.addChildren(n2);
        root.addChildren(n3);
        root.addChildren(n4);

        n2.addChildren(n5);
        n2.addChildren(n6);

        n6.addChildren(n8);
        n4.addChildren(n7);

        // Perform post-order DFS
        List<Integer> traversal = new ArrayList<>();
        postOrderDFS(root, traversal);

        System.out.println("Final Post-order DFS Traversal: " + traversal);
    }

    public static void postOrderDFS(Node node, List<Integer> result) {
        if (node == null) return;

        for (Node child : node.children) {
            postOrderDFS(child, result); //5-8-6-2-3-7-4-1
        }

        // Visit node
        System.out.println("Visiting node: " + node.value);
        result.add(node.value);
    }
}
