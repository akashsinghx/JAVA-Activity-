import java.util.Scanner;

public class Company
{
	private String comp_name;
	private String employees;
	private String teamlead = "Thomas";
	
	
	String getCompName()
	{
		return comp_name;
	}
	String getEmployees()
	{
		return employees;
	}
	String getTeamlead()
	{
		return teamlead;
	}
	void setName(String name)
	{
		this.comp_name=name;
	}
	void setAddress(String employees)
	{
		this.employees=employees;
	}
	
	public void display()
	{
		System.out.println("Comp name:"+comp_name);
		System.out.println("Employees: "+employees);
		System.out.println("TeamLead: "+teamlead);
	}
}