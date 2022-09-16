import java.util.Scanner;
class InputFromUser
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your details"); 
		System.out.println("Enter your FullName: ");
		String fname = sc.next();
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter your Salary: ");
		float salary = sc.nextFloat();
		System.out.println("Enter your Gender: ");
		char gender = sc.next().charAt(0);
		System.out.println("Your Name is: "+ fname );
		System.out.println("Your Age is: "+ age );
		System.out.println("Your Salary is: "+ salary );
		System.out.println("Your Gender is: "+ gender );
	}
}