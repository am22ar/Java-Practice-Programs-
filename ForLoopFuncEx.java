import java.util.*;
class ForLoopFuncEx
{
	static int loop(int n)
	{	
		for(int i=0; i<=n; i++)
		{
			if( i % 2 == 0)
			{
				System.out.print(i+" ");
			}
		}
		return n;
	}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter range: ");
		int num = s.nextInt(); 
		loop(num);
		
	}
}