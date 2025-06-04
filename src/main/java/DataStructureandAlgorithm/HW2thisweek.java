package DataStructureandAlgorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class HW2thisweek {
	public int solution(int[] A, int L, int R) {
		
		Set<Integer> target = new HashSet<>();
		for (int i = 0; i <= R; i++) {
			target.add(i);
		}
		
		HashMap<Integer, Integer> frequency= new HashMap<>();
		int left = 0;
		int minLength = Integer.MAX_VALUE;
		
		for (int right = 0; right < A.length; right++) {
			int num = A[right];
		//keep tracks number if it's appeared	
		if (target.contains(num)) {
			frequency.put(num, frequency.getOrDefault(num, 0) + 1);
			
		}
		//Shrink from the left
		while (frequency.size() == target.size()) {
			minLength = Math.min(minLength, right - left + 1);
			int leftNum = A[left];
			if (target.contains(leftNum)) {
				frequency.put(leftNum, frequency.get(leftNum) - 1);
				if (frequency.get(leftNum) == 0) {
					frequency.remove(leftNum);
				}
			}
			left++;
		}
		}
		return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
	}
}
