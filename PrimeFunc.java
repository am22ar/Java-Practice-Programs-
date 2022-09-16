import java.util.*;
class PrimeFunc
{
	static boolean isPrime(int n) //function 
	{
		boolean isPrime=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n % i == 0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = s.nextInt();
		boolean result = isPrime(num);//function call
		if(result == true)
		System.out.println(num+ " is Prime.");
		else
		System.out.println(num+ " is not Prime ");
	
	}
}