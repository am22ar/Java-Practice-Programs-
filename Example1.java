import java.util.*;
class Example1
{
	static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Num: ");
		int num1= s.nextInt(); 

		System.out.println("Enter 2nd Num: ");
		int num2 = s.nextInt(); 
		int x = add(num1, num2);
		System.out.println("Add: " +x);
		
	}
}