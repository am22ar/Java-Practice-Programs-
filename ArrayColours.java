import java.util.*;
class ArrayColours
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  Colours");
		int size = s.nextInt();
		//String colours=s.next();
		String colour[] = new String[size];
		for(int i=0; i<colour.length; i++)
		{
			colour[i]=s.next();
		}
		for(int i=0; i<colour.length; i++)
		{
			System.out.println("colours: "+ colour[i]);
		}
	}
}