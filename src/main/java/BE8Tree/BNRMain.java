package BE8Tree;

public class BNRMain {
    public static void main(String[] args) {
        BNRTree tree = new BNRTree();

        boolean balancedBefore = tree.isBalance();
        System.out.println("Is tree balanced before rotation? " + balancedBefore);

        System.out.println("Unbalanced nodes:");
        for (Be8Node node : tree.findImBalanceNodes()) {
            System.out.println(" - Node with value: " + node.value);
        }

        tree.root = tree.balance(tree.root);  
        
        boolean balancedAfter = tree.isBalance();
        System.out.println("Is tree balanced after rotation? " + balancedAfter);

        if (!tree.findImBalanceNodes().isEmpty()) {
            System.out.println("Still unbalanced nodes:");
            for (Be8Node node : tree.findImBalanceNodes()) {
                System.out.println(" - Node with value: " + node.value);
            }
        } else {
            System.out.println(" The tree is balanced now");
        }
    }
}
