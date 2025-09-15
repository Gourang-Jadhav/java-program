class WhileLoopDemo
{
	static int facto = 1;
	public static void main(String[] args)
	{
		getFactorial(5);
	}
	
	public static void getFactorial(int no)
	{
		int i = 1;
		while(i <= 5)
		{
			facto = facto * i;
			i++;
		}
		System.out.println(facto);
	}
}