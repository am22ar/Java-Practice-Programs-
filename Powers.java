import java.util.*;
class Powers
{
  public static void main(String args[])
  {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter Base Number: ");
	int base=scanner.nextInt();
	System.out.println("Enter Power: ");
	int p=scanner.nextInt();
	int power=1;
	for(int i=1; i<=p; i++)
	{
		power = power * base;
	 
	}
	System.out.println("Power of "+base+" raise to "+p+" is " + power );
  }
}
