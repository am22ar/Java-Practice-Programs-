import java.util.*;
class GuessGameFunc
{
	static void Game(int userNum)
	{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNum=2;
		int count=0;
		while( userNum != randomNum)
		{
			System.out.println("Guess Number between 1 to 10: ");
			int usernum = scan.nextInt();
			int randomnum = random.nextInt(10) + 1;
			

			System.out.println("UserNum "+ usernum);
			System.out.println("RandomNum "+ randomnum);
			count++;

		}
		System.out.println("Count is: "+count);
	}
	public static void main(String args[])
	{
		System.out.println("Parameter from main method: ");
		int userNum=0;
		Game(10);
		
	}
}