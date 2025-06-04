package DataStructureandAlgorithm;

import java.util.HashMap;

public class HWthisweek {
	public int solution(int[] A) {
		HashMap<Integer, Integer> firstIndex = new HashMap<>();
		int maxDistance = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (!firstIndex.containsKey(A[i])) {
				firstIndex.put(A[i], i);
			}
		int distance = i - firstIndex.get(A[i]);
		maxDistance = Math.max(maxDistance, distance);
		}
		return maxDistance;
	}

public static void main(String[] args) {
    HWthisweek hw = new HWthisweek();

    // Example input
    int[] A = {4, 6, 7, 2, 6, 6, 7};

    int result = hw.solution(A);
    System.out.println("Max distance: " + result);
}
}
