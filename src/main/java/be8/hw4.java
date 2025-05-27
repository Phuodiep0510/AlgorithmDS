package be8;

import java.util.Iterator;

public class hw4 {
	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int countOdd = 0;
		int countEven = 0;
		int[] arrayInt = {3, 7, 4, 9, 10};
//hw1		
		
		}
		
		for (int num : arrayInt) {
			if (num % 2 == 0) {
			sumEven += num;
			countEven ++;
		}
			else {
			sumOdd += num;
			countOdd ++;
		}
	}	
		System.out.println("Even count = " + countEven + ", Even sum = " + sumEven);
		System.out.println("Odd count = " + countOdd + ", Odd sum = " + sumOdd);	
//hw2		
		int min = arrayInt[0];
		int max = arrayInt[0];
		for (int num : arrayInt) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;	
			}
		}
		System.out.println("Smallest number = " + min);
		System.out.println("Biggest number = " + max);
//hw3 
		
		for (int i = 0; i < arrayInt.length; i++) {
			for (int j = i + 1; j < arrayInt.length; j++) {
				if (arrayInt[i] > arrayInt[j]) {
					int temporary = arrayInt[i];
					arrayInt[i] = arrayInt[j];
					arrayInt[j] = temporary;			
				}
			}
		}
		System.out.print("Sorted array = ");
		for (int num : arrayInt) {
			System.out.print(num + " ");
		}
		
	}
}

	main
