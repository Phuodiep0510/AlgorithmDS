package be8;

public class hw2 {
	public static void main(String[] args) {

//Declare A and B
		int A = 6;
		int B = 57;
	
//Round the square root of A & B
		int start = (int) Math.ceil(Math.sqrt(A));
		int end = (int) Math.floor(Math.sqrt(B));
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("start = " + start);
		System.out.println("end = " + end);
		
//Count the numbers between start & end
		int i = start;
		int count = 0;
		
		while (i <= end) {
			System.out.println(i*i); //print the squares
			count++;
			i++;
		}
		
		System.out.println("total perfect squares = " + count);
		
	}

}
