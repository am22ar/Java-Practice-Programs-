import java.util.*;
class GuessGame
{
  public static void main(String args[])
  {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	int userInput=1;
	int randomInput=0;
	int count=0;
	while(userInput != randomInput)
	{
		System.out.println("Guess Number between 1 to 10: ");
		 userInput = scanner.nextInt();
		 randomInput = random.nextInt(10) + 1;
		
		System.out.println("User Input: "+ userInput);
		System.out.println("Random Input: "+randomInput);
		count++;
	}
	System.out.println("Count : "+count);
  }
}