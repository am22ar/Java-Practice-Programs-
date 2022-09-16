import java.util.*;
class Dice
{
	public static void main(String args[])
	{
		Random r = new Random();
		int DiceNum = r.nextInt(6) + 1;
		System.out.println("Dice Number is: " + DiceNum);
		System.out.println("=============================");		
		
	}
}