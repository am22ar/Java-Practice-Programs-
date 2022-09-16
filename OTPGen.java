import java.util.Random;
class OTPGen
{
	public static void main(String args[])
	{
		Random r= new Random();
		// Generates 4 digit otp
		int min=1000;
		int max=9999;
		int Otp4= min + r.nextInt(max - min + 1);
		System.out.println(Otp4);
		

		//Generates 6 digit otp
		int minrange=100000;
		int maxrange=999999;
		int Otp6= minrange + r.nextInt(maxrange - minrange + 1);
		System.out.println(Otp6);
		
	}
}