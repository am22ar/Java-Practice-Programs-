import java.util.*;
class FactorialFunc
{
	static int Factorial(int x)
	{
		int fact=1;
		for(int i=x; i>1; i--)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = s.nextInt();
		System.out.println("Factorial of "+a+ " is "+Factorial(a));
		
	}
}