import java.util.*;
class ifelse1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=s.nextInt();
		System.out.println("Enter second Number: ");
		int num2=s.nextInt();
		if( num1 > num2 )
			System.out.println(num1 + " is greater than " + num2);
		else if( num1 == num2 )
			System.out.println(num1+ " is equal to "+ num2);
		else
			System.out.println(num2 + " is greater than " + num1);
		
	}
}