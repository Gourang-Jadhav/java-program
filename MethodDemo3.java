public class MethodDemo3
{
	public static void main(String[] args)
	{
		//System.out.println("\nAddition of 20 and 30 is "+addTwoNumbers(20,30));
		//System.out.println("\nsquare of 10 is "+findSquare(10));
		System.out.println("\nfull name : "+getFullName("Gourang","Jadhav"));
		
	}
	static int addTwoNumbers(int no1,int no2)
	{
		int sum;
		sum = no1 + no2;
		return sum;
	}
	static int findSquare(int number)
	{
		//int square;
		//square = number*number;
		//return square;
		return number*number;
	}
	static String getFullName(String firstName,String lastName)
	{
		return firstName+lastName;
	}
	
}