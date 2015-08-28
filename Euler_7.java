package Puzzles;

public class Euler_7 {

	public static void main(String[] args) {
		
		
		// We want to find the 10,001 prime number
		int idx = 0;
		int count = 0;
		
		for (int i=1; count<10001; i=i+2){
			if (isPrime(i)){
				count = count+1;
				idx = i;
			}
		}
	System.out.println(idx);	
		
	}
	
	public static boolean isPrime(int n){
		int m = (int)Math.sqrt(n);
		for (int i=2; i<m+1; i++){
			if (n%i == 0)
				return false;
		}
	return true;
}

}
