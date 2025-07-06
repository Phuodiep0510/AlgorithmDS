package BE8Tree;

import java.util.Arrays;

public class BSTBuilder {
public static void main(String[] args) {
	int[] nums = {2, 4, 9, 10, 8, 6, 7, 3, 1, 13};
	Arrays.sort(nums);
	
	BSTBuilder builder = new BSTBuilder();
	Be8Node root = builder.buildBST(nums, 0, nums.length - 1);
	
	builder.inOrderTraversal(root);
}

public Be8Node buildBST(int[] arr, int left, int right) {
	if (left > right) return null;
	int mid = (left + right) / 2;
	Be8Node node = new Be8Node(arr[mid]);
	node.left = buildBST(arr, left, mid - 1);
	node.right = buildBST(arr, mid + 1, right);
	return node;
}

public void inOrderTraversal(Be8Node node) {
	if (node == null) return;
	inOrderTraversal(node.left);
	System.out.println(node.value + " ");
	inOrderTraversal(node.right);
}
}
