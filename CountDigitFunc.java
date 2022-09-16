import java.util.*;
class CountDigitFunc
{
	static int countDigit(int num)
	{
		int count = 0;
		while( num != 0)
		{	
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = s.nextInt();
		int counts = countDigit(n);
		System.out.println("Count is: "+ counts);
	}
}