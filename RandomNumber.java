import java.util.*;
class RandomNumber
{
	public static void main(String args[])
	{
		Random r=new Random();
		// Random Number Generation with unknown Range.
		int randomNum1=r.nextInt();
		System.out.println("Unknown Random Number: "+randomNum1);				


		// Random Number Generation within Range.
		int randomNum2=r.nextInt(10);
		System.out.println("Random Number within Range: "+randomNum2);

		
		// Random Number Generation within Range starts with 1 instead of 0.
		int randomNum3=r.nextInt(5) + 1;
		System.out.println("Random Number within Range starting with 1: "+randomNum3);		

		//Random Number generation within any specified range .
		int randomNum4= 25 + r.nextInt(51);	
		System.out.println("Random Number within Range 25 to 75: "+randomNum4);
		
	}
}