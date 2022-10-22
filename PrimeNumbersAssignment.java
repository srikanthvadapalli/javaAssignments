import java.util.*;

public class PrimeNumbersAssignment{
	public static void main(String args[]){
		for(int i = 1; i<=10;i++){
			if (isPrime(i))
				System.out.println(i);
		}
	}
	static boolean isPrime(int n){
		int count = 0;
		if(n<2)
			return false;
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
				
			