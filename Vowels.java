import java.util.*;
class Vowels
{
  public static void main(String args[])
  {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter character: ");
	String character = s.next();
	switch(character)
	{
	case "A": System.out.println(character + " is a Vowel.");
		  break;
	case "E": System.out.println(character + " is a Vowel.");
		  break;
	case "I": System.out.println(character + " is a Vowel.");
		  break;
	case "O": System.out.println(character + " is a Vowel.");
		  break;
	case "U": System.out.println(character + " is a Vowel.");
		  break;
	default : System.out.println(character + " is not a Vowel" );
	} 
  }
}