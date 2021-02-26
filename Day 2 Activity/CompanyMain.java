import java.util.Scanner;

public class CompanyMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Company obj = new Company();
		System.out.println("Enter Company Name: ");
		String name = sc.nextLine();
		obj.setName(name);
		System.out.println("Enter Employees: ");
		String emp = sc.nextLine();
		obj.setAddress(emp);
		System.out.println("Enter TeamLead: ");
		String teamlead = sc.nextLine();
		if(obj.getTeamlead().equals(teamlead))
        {
			obj.display();
		}
        else
        {
	    System.out.println("Invalid Input");
        }
	}
}