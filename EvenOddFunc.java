import java.util.*;
class EvenOddFunc
{
	/*return type is boolean so return statement is added
	static boolean isEven(int num)
	{		
		return num % 2 == 0;
	}
	*/

	//return type is void so no return statement 
	static void EvenOdd(int n)
	{
		if( n % 2 == 0)
		System.out.println("Evennn");
		else
		System.out.println("Oddddd");
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		
		//1st function call
		if(isEven(n))
		System.out.println("Even");
		else
		System.out.println("Odd");
		

		//2nd Function call
		EvenOdd(n);
	}
}