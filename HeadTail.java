import java.util.*;
class HeadTail
{
	public static void main(String args[])
	{
		Random r= new Random();
		int randomNum = r.nextInt(2);
		System.out.println(randomNum);
		if(randomNum == 1)
		{	
			System.out.println("Head");
		}
		else
		{
			System.out.println("Tails");
		}
	}
}