import java.util.*;

class SwapTwoNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter value of y: ");
		int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: "+x +" "+y);
	}
}
