class infiniteforloop
{
	public static void main(String args[])
	{	
		int i=1;
		for( ; i<=3; i++)
		{
			System.out.println(i);
		}
		for( ; true; )
		{
			System.out.println("Hello");
		}
		for( ; ; )
		{
			System.out.println("Hello");
		}
		
		for( ;  ; )
		{
			System.out.println("Hello");
		}
	}
}