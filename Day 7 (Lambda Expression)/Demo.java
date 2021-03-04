@FunctionalInterface

public interface Demo {

 

	//case 3

	public int add(int a, int b);

	

	//case 2

	//public void sum(int a, int b);

	

	//Case 1

	//public void display();

	default void show() {

		System.out.println("I am default method");

	}

}