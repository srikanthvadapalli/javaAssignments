import java.util.*;
//import java.lang.*;
public class ConditionalStatementsAssignment{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		if((num1 > num2)&&(num1 > num3)){
			System.out.println("first number: "+num1+ " is greatest number");
		}
		else if ((num2>num1)&&(num2>num3)){
			System.out.println("second number: "+num2+" is greatest number");
		}
		else{
			System.out.println("third number: "+num3+" is greatest number");
		}
	}
}