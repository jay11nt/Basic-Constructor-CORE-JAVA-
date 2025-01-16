package corejava;

class D
{
	int x,y;
	D(int a,int b)     //Parameterized Constructor
	{
		x=a; y=b;
	}
	
	D(int a,String b)     //Parameterized Constructor
	{
		System.out.println(a+" "+b);
	}
	void show()           //method
	{
		System.out.println(x+" "+y);
	}
}

public class Constructor_Parameterized_example 
{

	public static void main(String[] args) 
	{
		D ref=new D(100,200);
		D r=new D(100,"Ajay");
        ref.show();
		

	}

}
