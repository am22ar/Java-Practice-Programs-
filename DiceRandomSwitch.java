import java.util.*;
class DiceRandomSwitch
{
  public static void main(String args[])
  {
	Random r = new Random();
	int DiceNum= r.nextInt(6)+1;
	switch( DiceNum )
	{
	case 1: System.out.println(DiceNum +" =>One ");
		break;
	case 2: System.out.println(DiceNum +" =>Two ");
		break;
	case 3: System.out.println(DiceNum +" =>Three ");
		break;
	case 4: System.out.println(DiceNum +" =>Four ");
		break;
	case 5: System.out.println(DiceNum +" =>Five ");
		break;
	default: System.out.println(DiceNum +" =>Six ");
		break;
	}
  }
}