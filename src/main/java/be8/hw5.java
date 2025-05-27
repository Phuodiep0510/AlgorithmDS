package be8;

public class hw5 {
    public static void main(String[] args) {
//hw1
        int[] arrayInt = {3, 4, 6, 49, 3};
        int i = 0;
        int j = arrayInt.length - 1;

        boolean isPalindrome = true;

        while (i < j) {
            if (arrayInt[i] != arrayInt[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Array is a palindrome.");
        } else {
            System.out.println("Array is not a palindrome.");
            
//hw2
        }
    }
}