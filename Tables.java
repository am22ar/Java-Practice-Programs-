import java.util.*;
class Tables
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = s.nextInt();
		for (int i=1; i<11;i++)
		{
			System.out.println(n + "x" + i + "=" + (n*i));
		}
	}
}