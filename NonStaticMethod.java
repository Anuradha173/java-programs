package basicprograms;

public class NonStaticMethod 
{
	void add()
	{
		int a=10;
		int b=40;
		int sum=a+b;
		{
			System.out.println(sum);
		}
	}

	
	public static void main(String[] args) {
		NonStaticMethod  a1 = new NonStaticMethod ();
	a1.add();

	}

}
