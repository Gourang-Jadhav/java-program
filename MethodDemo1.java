public class MethodDemo1
{
	public static void main(String[] args)
	{
		System.out.println("\nfactorial of  5 = "+fact(5));
	}
	private static int fact(int no1)
	{
		int facto = 1;
		no1--;
		if(no1 != 0)
		{
			facto = facto * fact(no1);
		}
		return facto;
	}
	private static int square(int no1)
	{
		int sqaure = no1 * no1;
		return sqaure;
	}
}