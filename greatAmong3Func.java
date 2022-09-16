import java.util.*;
class greatAmong3Func
{
	static void ifElif(int num1, int num2 , int num3)
	{
		if(num1 > num2 && num1 > num3)
		  System.out.println(num1+" is greater");
		else if(num2 > num3)
		  System.out.println(num2+" is greater");
		else
		  System.out.println(num3+" is greater");		
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		ifElif(n1,n2,n3);
	}
}