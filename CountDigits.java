import java.util.*;
class CountDigits
{
  public static void main(String args[])
  {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = s.nextInt();	
	int count=0;
	while(num != 0 )
	{
		num = num / 10;
		count++;	
	}
	System.out.println("Count of Digits: "+ count);
	
  }
}