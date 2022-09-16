import java.util.*;
class GambleGame
{
  public static void main(String args[])
  {
	Random r = new Random();
	
	int money=10;
	int totalplay=0;
	int totalwins=0;
	while( money!=20 && money!=0 )
	{
		totalplay++;
		int bet = r.nextInt(2);
		System.out.println("Initial Money: "+money);
		if(bet == 1)
		{
		money++;
		totalwins++;
		}
		else
		money--;
	
		System.out.println("Remaining money: "+money);
	}
	System.out.println("Total plays: "+ totalplay);
	System.out.println("Total wins: "+ totalwins);
	System.out.println("Total loss: "+ (totalplay-totalwins));

  }
}