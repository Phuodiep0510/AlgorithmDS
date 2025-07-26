package DataStructureandAlgorithm;

import java.util.Arrays;

public class ticketDP {
	public int solution(int[] A) {
	    int N = A.length;
	    int[] dp = new int[N + 1];
	    dp[0] = 0;

	    for (int i = 1; i <= N; i++) {
	        int day = A[i - 1];

	        // 1-day ticket
	        int cost1 = dp[i - 1] + 2;

	        // 7-day ticket
	        int j = i - 1;
	        while (j >= 0 && A[i - 1] - A[j] < 7) j--;
	        int cost7 = dp[j + 1] + 7;

	        // 30-day ticket
	        j = i - 1;
	        while (j >= 0 && A[i - 1] - A[j] < 30) j--;
	        int cost30 = dp[j + 1] + 25;

	        dp[i] = Math.min(cost1, Math.min(cost7, cost30));
	    }

	    return dp[N];
	}

	  public static void main(String[] args) {
	        int[] A = {1, 2, 4, 5, 7, 29, 30, 60, 79, 100, 301, 365};
	        ticketDP solver = new ticketDP();
	        int totalCost = solver.solution(A);
	        System.out.println("Total Minimum Cost: " + totalCost);
	    
	    }
}