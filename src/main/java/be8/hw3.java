package be8;

public class hw3 {
public static void main(String[] args) {
	double a = 100000; //declare a double number
	double startGuess = 1.0; //declare a random guess start from 1
	double newGuess = (startGuess + a / startGuess) / 2; //Newton's method
	
//Check if there is a big difference between 2 numbers	
	while (Math.abs(newGuess - startGuess) > 0.01) {
	//or there is another way (Math.abs(startGuess * startGuess - a) > 0.01)
	//-->But it will give higher error margin
		startGuess = newGuess; 
		newGuess = (startGuess + a / startGuess) / 2;
		System.out.println("Guess = " + newGuess);
	}
	
	System.out.println("Final square root = " + newGuess);
}
}
