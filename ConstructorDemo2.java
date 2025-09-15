package com.prowings.corejava.;

class Person
{	
	Person()
	{
		System.out.println();
	}
	Person(String name,float height)
	{
		System.out.println("person name = "+name);
		System.out.println("person height = "+height);
			
	}
}
public class ConstructorDemo2 
{
	public static void main(String[] args)
	{	
//		Person p = new Person("Rakesh", 5.10f);
		MethodDemo m = new MethodDemo();
		m.sum();
			
		//System.out.println("perso name = "+f.name);
		//System.out.println("s1 rollno = "+s1.rollno);
	}
	
}