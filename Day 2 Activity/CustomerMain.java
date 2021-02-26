import java.util.Scanner;

public class CustomerMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Customer obj = new Customer();
		System.out.println("Enter your details: ");
		String details = sc.nextLine();
		String array[] = details.split(",");
		obj.setName(array[0]);
		obj.setAddress(array[1]);
		obj.setMobile(array[2]);
		obj.display();
		
	}
}