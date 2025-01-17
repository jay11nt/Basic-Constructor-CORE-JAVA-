package corejava;

class Constructor_private_example
{
	int a; 
	double b; String c;
	private Constructor_private_example()             //Private Constructor
	{
		a=10; b=20.3; c="Pass";
		System.out.println(a+" "+b+" "+c);
	}
	
	static void show()
	{
		int a,b,c;
		a=10; b=20;
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Constructor_private_example r=new Constructor_private_example();
		r.show();

	}

}
