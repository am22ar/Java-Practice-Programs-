import java.util.*;
class GambleGameFunc
{
	static int Game(int money)
	{
		Random r = new Random();
		int bet = r.nextInt(2);
		int totalcount=0;
		int win=0;
		while(money != money*2 && money != 0)
		{
			//int bet = r.nextInt(2);
			totalcount++;
			System.out.println("initial "+ money);
			if( bet == 1)
			{
				money++;
				win++;
			}
			else
			{
				money--;
			}
			System.out.println("Remaining "+money);
			
			System.out.println("games played "+totalcount);
			System.out.println("games won "+win);
			System.out.println("games lost "+(totalcount-win));

		}
	 
		return money;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Money You Have: ");
		int moneyy = s.nextInt();
		Game(moneyy);
	}
}