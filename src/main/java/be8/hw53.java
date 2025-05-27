package be8;

import java.util.ArrayList;

public class hw53 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 7, 6, 4};

 //Create a new array that contains only integers
        ArrayList<Integer> tempList = new ArrayList<>();

 //Move numbers from old to new array
        for (int num : nums) {
            if (tempList.contains(num)) {
                tempList.remove((Integer) num); // remove the number if already exists
            } else {
                tempList.add(num); // otherwise, add it
            }
        }

        // At the end, only single numbers should be left
        System.out.print("Single numbers are: ");
        for (int i = 0; i < tempList.size(); i++) {
            System.out.print(tempList.get(i));
            if (i < tempList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}