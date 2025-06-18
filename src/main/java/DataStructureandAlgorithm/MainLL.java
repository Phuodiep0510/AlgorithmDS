package DataStructureandAlgorithm;

public class MainLL {
	public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the chain
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("Original list:");
        list.printList();

        // Delete a random item
        list.deleteRandom();
        System.out.println("After deleting a random node:");
        list.printList();

        // Insert a random item
        list.insertRandom(101);  // you can change 99 to any number
        System.out.println("After inserting 99 at a random position:");
        list.printList();
}
}
