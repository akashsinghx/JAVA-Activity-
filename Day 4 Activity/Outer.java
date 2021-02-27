package staticinnerclass;

public class Outer 
{
	int a =10;

	class Inner
	{
		int a = 100;
		public void m1()
		{
			System.out.println("I am inner class");
			int a = 1000;
			System.out.println("Inner Method Value: "+ a);
			System.out.println("Inner Class Value: "+ this.a);
			
		}
	}
	
	public static void main(String[] args)
	{
		Outer o = new Outer();
		
		
		System.out.println("Outer Value of a: " + o.a);
		
		
		new Outer().new Inner().m1();
	}

	
}