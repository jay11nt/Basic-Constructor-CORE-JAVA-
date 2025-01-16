package corejava;

class E
{
	int a;String b,c; 
	E()
	{
		a=10; b="Ajay"; c="Mandhare";
		System.out.println(a+" "+b+" "+c);
	}
	
	E(E ref)                        //Copy Constructor
	{
		a=ref.a;
		b=ref.b;
		c=ref.c;
		System.out.println(a+" "+b+" "+c);
	}
}

public class Constructor_Copy_example
{

	public static void main(String[] args) 
	{
		E r=new E();
		E ref=new E(r);

	}

}
