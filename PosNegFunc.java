import java.util.*;
class PosNegFunc
{
	static int posNeg(int number)
	{
		if( number > 0)
		System.out.println("Positive");
		else
		System.out.println("Negative");
		return number; 
	}
	
	static int posNegZero(int n)
	{
		if(n > 0)
		System.out.println(n+ " Number is Positive");
		else if(n < 0)
		System.out.println(n+ " Number is Negative");
		else
		System.out.println(n+ " Number is Zero");
		
		return n;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = s.nextInt();		
		posNeg(num);
		posNegZero(num);
		
		
		
	}
}