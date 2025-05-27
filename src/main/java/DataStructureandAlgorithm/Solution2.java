package DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Solution2 {
	public int Solution(int[] A, int[] B) {
		int sumA = Arrays.stream(A).sum(); //O(n)
		int sumB = Arrays.stream(B).sum(); //O(m)
		
		if (sumA == sumB) return 0;
		if (sumA > sumB) {
			return Solution(B, A);
		}
		int difference = sumB - sumA;
		java.util.List<Integer> gains = new ArrayList<>();
		for (int a : A) {
			if (6 - a > 0)  //max increase //O(n)
				gains.add(6 - a);
		}
		for (int b : B) {
			if (b - 1 > 0) //min decrease //O(m)
				gains.add(b - 1);
		}
		gains.sort(Collections.reverseOrder()); //make as less change as possible 
		// O(n+m log(n+m))
		
		int count = 0;
		for (int gain : gains) {
			difference -= gain;
			count++; 
			if (difference <= 0) return count;
		}
		return -1;
	}
public static void main(String[] args) {
	Solution2 sol = new Solution2();
	 System.out.println(sol.Solution(new int[]{5}, new int[]{1, 1, 6})); // Output: 1
     System.out.println(sol.Solution(new int[]{2, 3, 1, 1, 2}, new int[]{5, 4, 6})); // Output: 2
     System.out.println(sol.Solution(new int[]{5, 4, 1, 2, 6, 5}, new int[]{2})); // Output: 6
     System.out.println(sol.Solution(new int[]{1, 2, 3, 4, 3, 2, 1}, new int[]{6})); // Output: -1
 }
}
