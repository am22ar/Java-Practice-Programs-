import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
	//Switch conditions according to user choice.
	Scanner s = new Scanner(System.in);
	System.out.println("Enter\n 1.Add\n 2.Sub\n 3.Mul\n 4.Div\n");
	int choice = s.nextInt();
	System.out.println("Enter 1st Number");
	int num1 = s.nextInt();
	System.out.println("Enter 2nd Number");
	int num2 = s.nextInt();
	switch(choice)
	{
	case 1: int res=num1+num2;
		System.out.println("Addition is: "+ res);
		break;
	case 2: int res1=num1-num2;
		System.out.println("Subtraction is: "+ res1);
		break;
	case 3: int res2=num1*num2;
		System.out.println("Multiplication is: "+ res2);
		break;
	case 4: int res3=num1/num2;
		System.out.println("Division is: "+ res3);
		break;	
	default:
		System.out.println("invalid Choice");
	}
  }
}