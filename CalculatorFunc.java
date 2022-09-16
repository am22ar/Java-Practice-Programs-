import java.util.*;
class CalculatorFunc
{
	static int add(int x, int y)
	{
		return x+y;
	}
	static int sub(int x, int y)
	{
		return x-y;
	}
	static int mul(int x, int y)
	{
		return x*y;
	}
	static int div(int x, int y)
	{
		return x/y;
	}

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Press\n 1.Add\n 2.Sub\n 3.Mul\n 4.Div\n");
		int choice = scan.nextInt();
		System.out.println("Enter 1st Number");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = scan.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Addition is: "+ add(num1,num2));
				break;
			case 2: System.out.println("Subtraction is: "+ sub(num1,num2));
				break;
			case 3: System.out.println("Multiplication is: "+ mul(num1,num2));
				break;
			case 4: System.out.println("Division is: "+ div(num1,num2));
				break;
			default: System.out.println(choice+ " Invalid Choice");
		}
	}

}