import java.util.*;
class DiceAdd
{
	public static void main(String args[])
	{
		Random r = new Random();
		int DiceNum1 = r.nextInt(6) + 1;
		int DiceNum2 = r.nextInt(6) + 1;

		System.out.println("Addition of two Dice "+DiceNum1+" and "+DiceNum2+" = "+ (DiceNum1+DiceNum2));
	}
}