public class Student
{
	int rollno;
	String name;
	float marks;
	static String schoolName = "Maharana pratap";
	
	public Student()//no-args construcotor
	{
			
	}
	public Student(int rollno,String name,float marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;	
	}
	public Student(int rollno)
	{
		this.rollno = rollno;
	}
	public Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	Student(Student s1)//copy constructor
	{
		this.rollno = s1.rollno;
		this.name = s1.name;
		this.marks = s1.marks;
	}
	
	public static void main(String[] args)
	{
		
		Student s1 = new Student(15,"Ratan tata");
		
		System.out.println("\ns1 object print");
		System.out.println("s1 rollno = "+s1.rollno);
		System.out.println("s1 name = "+s1.name);
		System.out.println("s1 marks = "+s1.marks);
		System.out.println("s1 schoolname = "+schoolName);
	
		Student s2 = new Student(s1);
		
		System.out.println("\nprint s2 object");
		System.out.println("s2 rollno = "+s2.rollno);
		System.out.println("s2 name = "+s2.name);
		System.out.println("s2 marks = "+s2.marks);
		System.out.println("s2 schoolname = "+s2.schoolName);
		
	}
	
}