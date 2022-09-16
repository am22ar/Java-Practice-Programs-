import java.util.*;
class PrimeNum
{
  public static void main(String args[])
  {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = scanner.nextInt();
	boolean isPrime=true;
	for(int i=2; i<=num/2; i++ )
	{
		if(num % 2 == 0)	
		{
			isPrime=false;
			break;
		}
	}
	if(isPrime == true)
	System.out.println(num+" is Prime");
	else
	System.out.println(num+" is not Prime");
  }
}