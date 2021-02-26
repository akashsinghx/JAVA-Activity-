import java.util.Scanner;
public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.setName("Sai");
		obj.setAddress("kurnool");
		obj.setMobile("7013837650");
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getMobile());
	}
}
