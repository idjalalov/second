package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on given range.
		 * 
		 */

		int counter=0;
		int limit = 1000000;
		for (int i=6; i<limit; i++){
			
			if (i%2==0 || i%3==0  || i%5==0){
			
			}
			else {
				counter ++;
				System.out.println (i + " is a prime number");
			}
		}
		System.out.println ("Quantity of prime numbers between 1 and " + limit + " is equal to " + counter + ", exluding 1, 2, 3 and 5.");
		
	}

}
