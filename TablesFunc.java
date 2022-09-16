import java.util.*;
class TablesFunc
{
	static void Table(int n)
	{	
		for(int i=1; i<=10; i++)
		{	
			System.out.print(n * i+ " ");
		}
		//return n;
	}
	
	public static void main(String args[])
	{
	 // Scanner s = new Scanner(System.in);	
      	  //System.out.println("Enter a Number");
	  //int num = s.nextInt();//12
	   Table(10);
	   Table(20);
	   Table(5);
	}
}