import java.util.*;
class VowelsFunc
{
	static char VowelSwitch( char ch )
	{
		switch(ch)
		{
			case 'a': System.out.println(ch+" is Vowel");
				break;
			case 'A': System.out.println(ch+" is Vowel");
				break;
			case 'e': System.out.println(ch+" is Vowel");
				break;
			case 'E': System.out.println(ch+" is Vowel");
				  break;
			case 'i': System.out.println(ch+" is Vowel");
				break;
			case 'I': System.out.println(ch+" is Vowel");
				  break;
			case 'o': System.out.println(ch+" is Vowel");
				break;
			case 'O': System.out.println(ch+" is Vowel");
				  break;
			case 'u': System.out.println(ch+" is Vowel");
				break;
			case 'U': System.out.println(ch+" is Vowel");
				  break;
			default : System.out.println(ch+" Not a Vowel"); 
		}
		return ch;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Character");
		char vowel = s.next().charAt(0);
		char v = VowelSwitch(vowel);
		System.out.println("Vowel: "+v);
		
	}
}
