package corejava;

class A
{
	int a; 
	String b;
	boolean c;
	
	     A()                  //default constructor
		{
		   a=50; b="ajay"; c=true;
		}
	
	  void disp()
		{
		  System.out.println(a+" "+b+" "+c);
		}
	
	void show()
	    {
		int a=11;
		String b="Ajju";
		String c="sam";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	    }
}

public class Constructor_example 
{

	public static void main(String[] args)
	   {
		A c = new A();
		c.disp();
		c.show();
	   }

}
