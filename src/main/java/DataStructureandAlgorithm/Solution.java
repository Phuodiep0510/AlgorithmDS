package DataStructureandAlgorithm;

import java.util.Scanner;

public class Solution {
    public static int solution(int N) {
        String binary = Integer.toBinaryString(N); //O(logN) -->upwards logarithmic curve
        System.out.println("Binary: " + binary); 

        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                if (counting) {
                    if (currentGap > maxGap) {
                        maxGap = currentGap;
                    }
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }

        System.out.println("Max Gap: " + maxGap); 
        return maxGap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        int result = solution(N);
        System.out.println("Longest binary gap: " + result);
    }
}
