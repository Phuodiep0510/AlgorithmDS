package DataStructureandAlgorithm;

import java.util.Random;
public class LinkedList {
	LinkedListNode head;
	
	public void add(int data) {
		LinkedListNode newNode = new LinkedListNode(data);
		if (head == null) {
			head = newNode;
			return;
			
		}
		LinkedListNode current = head;
		while (current.next != null) 
			current = current.next;
			current.next = newNode;		
		}
	public void printList() {
			LinkedListNode current = head;
			while (current != null) {
				System.out.println(current.data + " -> ");
				current = current.next;
			}
			System.out.println("null");
		}
	
	public void deleteRandom() {
		if (head == null) return;
		Random rand = new Random();
		int length = getLength();
		int pos = rand.nextInt(length);
		
		if (pos == 0) {
			head = head.next;
			return;
		}
		LinkedListNode current = head;
		for (int i = 0; i < pos - 1; i++) 
			current = current.next;
		if (current.next != null)
			current.next = current.next.next;
		}
	public void insertRandom(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        Random rand = new Random();
        int length = getLength();
        int pos = rand.nextInt(length + 1); // position from 0 to length

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        LinkedListNode current = head;
        for (int i = 0; i < pos - 1; i++)
            current = current.next;

        newNode.next = current.next;
        current.next = newNode;
    }

    // Helper to get the length
    private int getLength() {
        int count = 0;
        LinkedListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
	}
}
