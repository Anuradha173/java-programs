package basicprograms;
public class ConstructorOverloading {

	
	void add()
	{
		int a=10;
		int b=40;
		int sum=a+b;
		{
			System.out.println(sum);
		}
	}
		
			static void substarct ()
			{
				int a=10;
				int b=40;
				int sub=b-a;
				{
					System.out.println(sub);
				}
			}
		
	ConstructorOverloading()//this is basically a constructor without parameter
	{

		System.out.println(" My name is Anuradha");
	}
	ConstructorOverloading( int a) // this concept is called constructor overloading
	{
		System.out.println("constructor with parameter ");

	}
	ConstructorOverloading( int a, double b) // this concept is called constructor overloading
	{
		System.out.println("constructor with two parameter ");

	}
	
	
	public static void main(String[] args) 
	{
		new ConstructorOverloading();// calling the constructor
		new ConstructorOverloading(-4500);
		ConstructorOverloading a1= new ConstructorOverloading(100, 3.44);// 2nd way of calling the constructor
		ConstructorOverloading a11 = new ConstructorOverloading  ();
		a11.add();
		a11.substarct();

		

	}

}
