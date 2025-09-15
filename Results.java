public class Results
{
	public static void main(String[] args)
	{
		Results r = new Results();
		r.max();
	}
	public void max()
	{
		int no1 = 3, no2 = 5;
		System.out.println("\ngiven no : "+no1+" & "+no2);
		System.out.println((no1 > no2) ? ("\n"+no1+" is max") : ("\n"+no2+" is max"));
	}	
}