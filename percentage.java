import java.util.*;
class percentage
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Percentage: ");
		int percentage = scan.nextInt();
		if(percentage > 100 || percentage < 0 )
		System.out.println("Invalid Percentage");
		else if(percentage >=75)
		System.out.println("FCD");
		else if(percentage>=60 && percentage < 75)
		System.out.println("First Class");
		else if(percentage>=50 && percentage < 60)
		System.out.println(" Second Class");
		else if(percentage >=35 && percentage < 50)
		System.out.println("Just passed");
		else
		System.out.println("Sorry!! you failed");
	}
}