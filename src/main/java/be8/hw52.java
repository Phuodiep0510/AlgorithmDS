package be8;

public class hw52 {
	public static boolean isPrime(int number) {
	if (number <= 1) return false;
	
//Check number from 2 up to square root to avoid repeat calculations	
	for (int i = 2; i <= Math.sqrt(number); i++) {
		if (number % i == 0) return false;
	}
	return true;
	
  }
	public static void main(String[] args) {
		System.out.println(isPrime(7));  
        System.out.println(isPrime(10)); 
       
	}
}
